---
---
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

using Microsoft.Win32;
using System.IO;

namespace WpfDemo
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }

        private void OpenFileBtn_Click(object sender, RoutedEventArgs e)
        {
            OpenFileDialog openFileDialog = new OpenFileDialog
            {
                Filter = "MIDI Files (*.mid)|*.mid|All Files (*.*)|*.*"
            };
            if (openFileDialog.ShowDialog() == true)
            {
                string filename = openFileDialog.FileName;
                filenameText.Text = filename;
                if (File.Exists(filename))
                {
                    using (BinaryReader reader = new BinaryReader(File.Open(filename, FileMode.Open)))
                    {
                        string type = new string(reader.ReadChars(4));
                        if (type == "MThd")
                        {
                            int format = LittleToBigEndian(reader.ReadBytes(2), 2);
                            formatText.Text = $"{format}";
                            if (format == 0)
                            {
                                formatText.Text += " (Single multi-channel track)";
                            }
                            else if (format == 1)
                            {
                                formatText.Text += " (One or more simultaneous tracks)";
                            }
                            else if (format == 2)
                            {
                                formatText.Text += " (One or more independant sequences)";
                            }
                            int tracks = LittleToBigEndian(reader.ReadBytes(2), 2);
                            tracksText.Text = $"{tracks}";
                            int division = LittleToBigEndian(reader.ReadBytes(2), 2);
                            string divisionStr = $"{division} ticks per quarter-note";
                            if ((division & 0x8000) != 0)
                            {
                                int smtpe = (sbyte)(division & 0x7F00) >> 8;
                                string frames = smtpe == -29 ? $"{Math.Abs(smtpe)} frames per second" : "30 frames per second, drop frame";
                                int ticks = division & 0xFF;
                                divisionStr = $"SMTPE {smtpe} ({frames}), {ticks} ticks per frame";
                            }
                            divisionText.Text = divisionStr;
                        }
                        else
                        {
                            MessageBox.Show("This file doesn't have a MIDI header. Are you sure it's a MIDI file?");
                        }
                    }
                }
            }
        }

        static int LittleToBigEndian(byte[] src, int size)
        {
            int result = 0;
            for (int i = 0; i < size; i++)
            {
                result += src[size - 1 - i] << i * 8;
            }
            return result;
        }
    }
}
