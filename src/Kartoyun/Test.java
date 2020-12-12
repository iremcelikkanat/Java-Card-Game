package Kartoyun;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Test extends JFrame {

    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Test frame = new Test();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    int indistut = 0;
    int id = 0;
    ArrayList<Tenisci> oyuncuT = new ArrayList<>();
    ArrayList<Basketbolcu> oyuncuB = new ArrayList<>();
    ArrayList<Tenisci> pcT = new ArrayList<>();
    ArrayList<Basketbolcu> pcB = new ArrayList<>();

    ArrayList<Tenisci> tenisciDeste = new ArrayList<>();//teniscilerin oldugu liste
    ArrayList<Basketbolcu> basketciDeste = new ArrayList<>();//basketcilerin oldugu liste

    ArrayList<kartBasketbol> kartlarB = new ArrayList<>();
    ArrayList<kartT> kartlarT = new ArrayList<>();

    
    Bilgisayar bilgisayar = new Bilgisayar();
    Kullanici kullanici = new Kullanici();

    Tenisci tenisci = new Tenisci();

    public int oyuncuSkor = 0;
    public int pcSkor = 0;

    Timer m = new Timer();

    JLabel oyuncuAdi = new JLabel("");
    JLabel oyuncuisim = new JLabel("");

    public Test() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 1920, 1070);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        Tenisci Sharapova = new Tenisci(11, 38, 37, "Maria Sharapova", "fb", 1, false);
        tenisciDeste.add(Sharapova);

        Tenisci Federer = new Tenisci(14, 39, 36, "Roger Federer", "gb", 2, false);
        tenisciDeste.add(Federer);

        Tenisci Williams = new Tenisci(13, 40, 38, "Serena Williams", "bg", 3, false);
        tenisciDeste.add(Williams);

        Tenisci Nadal = new Tenisci(15, 37, 40, "Rafeal Nadal", "fd", 4, false);
        tenisciDeste.add(Nadal);

        Tenisci Dokovic = new Tenisci(12, 36, 39, "Novak Dokovic", "gb", 5, false);
        tenisciDeste.add(Dokovic);

        Tenisci caglaBuyukakcay = new Tenisci(10, 31, 33, "Cagla Buyukakcay", "Turkey", 6, false);
        tenisciDeste.add(caglaBuyukakcay);

        Tenisci ipekSoylu = new Tenisci(9, 29, 35, "Ipek Soylu", "Turkey", 7, false);
        tenisciDeste.add(ipekSoylu);

        Tenisci hulyaAvsar = new Tenisci(7, 24, 19, "Hulya Avsar", "Turkey", 8, false);
        tenisciDeste.add(hulyaAvsar);

        Basketbolcu stephenCurry = new Basketbolcu(108, 99, 111, "Stephan Curry", "Golden State Warriors", 10);
        basketciDeste.add(stephenCurry);

        Basketbolcu lebronJames = new Basketbolcu(94, 111, 123, "Lebron James", "Los Angeles Lakers", 20);
        basketciDeste.add(lebronJames);

        Basketbolcu michaelJames = new Basketbolcu(96, 102, 94, "Micheal Perry James", "CSKA Moskova", 30);
        basketciDeste.add(michaelJames);

        Basketbolcu klayThompson = new Basketbolcu(100, 96, 95, "Klay Thompson", "Golden State Warriors", 40);
        basketciDeste.add(klayThompson);

        Basketbolcu cediOsman = new Basketbolcu(88, 87, 75, "Cedi Osman", "Cleveland Cavaliers", 50);
        basketciDeste.add(cediOsman);

        Basketbolcu furkanKorkmaz = new Basketbolcu(86, 81, 79, "Furkan Korkmaz", "Philadelphia 76ers", 60);
        basketciDeste.add(furkanKorkmaz);

        Basketbolcu ersanIlyasova = new Basketbolcu(84, 90, 80, "Ersan Ilyasova", "Milwaukee Bucks", 70);
        basketciDeste.add(ersanIlyasova);

        Basketbolcu kobeBryant = new Basketbolcu(106, 114, 123, "Kobe Bryant", "Los Angeles Lakers", 80);
        basketciDeste.add(kobeBryant);

        int i = 0;
        while (i < 4) {
            int a = ((int) (Math.random() * 4));
            oyuncuT.add(tenisciDeste.get(a));
            tenisciDeste.remove(a);

            int q = ((int) (Math.random() * 4));
            oyuncuB.add(basketciDeste.get(q));
            basketciDeste.remove(q);
            i++;
        }
        int w = 0;
        while (w < 4) {
            pcT.add(tenisciDeste.get(w));
            pcB.add(basketciDeste.get(w));

            w++;
        }

        tenisciDeste.clear();
        basketciDeste.clear();

        bilgisayar.setBasketciDeste(oyuncuB);
        bilgisayar.setTenisciDeste(oyuncuT);
        kullanici.setBasketciDeste(pcB);
        kullanici.setTenisciDeste(pcT);
        contentPane.setLayout(null);

        kartT bilgisayarKart1 = new kartT(pcT.get(0).getSporcuIsim(), pcT.get(0).getForhand(), pcT.get(0).getBackhand(), pcT.get(0).getServis());
        contentPane.add(bilgisayarKart1);
        kartlarT.add(bilgisayarKart1);

        kartBasketbol bilgisayarKart2 = new kartBasketbol(pcB.get(0).getSporcuIsim(), pcB.get(0).getIkilik(), pcB.get(0).getUcluk(), pcB.get(0).getSerbestAtis());
        contentPane.add(bilgisayarKart2);
        kartlarB.add(bilgisayarKart2);

        kartT bilgisayarKart3 = new kartT(pcT.get(1).getSporcuIsim(), pcT.get(1).getForhand(), pcT.get(1).getBackhand(), pcT.get(1).getServis());
        contentPane.add(bilgisayarKart3);
        kartlarT.add(bilgisayarKart3);

        kartBasketbol bilgisayarKart4 = new kartBasketbol(pcB.get(1).getSporcuIsim(), pcB.get(1).getIkilik(), pcB.get(1).getUcluk(), pcB.get(1).getSerbestAtis());
        contentPane.add(bilgisayarKart4);
        kartlarB.add(bilgisayarKart4);

        kartT bilgisayarKart5 = new kartT(pcT.get(2).getSporcuIsim(), pcT.get(2).getForhand(), pcT.get(2).getBackhand(), pcT.get(2).getServis());
        contentPane.add(bilgisayarKart5);
        kartlarT.add(bilgisayarKart5);

        kartBasketbol bilgisayarKart6 = new kartBasketbol(pcB.get(2).getSporcuIsim(), pcB.get(2).getIkilik(), pcB.get(2).getUcluk(), pcB.get(2).getSerbestAtis());
        contentPane.add(bilgisayarKart6);
        kartlarB.add(bilgisayarKart6);

        kartT bilgisayarKart7 = new kartT(pcT.get(3).getSporcuIsim(), pcT.get(3).getForhand(), pcT.get(3).getBackhand(), pcT.get(3).getServis());
        contentPane.add(bilgisayarKart7);
        kartlarT.add(bilgisayarKart7);

        kartBasketbol bilgisayarKart8 = new kartBasketbol(pcB.get(3).getSporcuIsim(), pcB.get(3).getIkilik(), pcB.get(3).getUcluk(), pcB.get(3).getSerbestAtis());
        kartlarB.add(bilgisayarKart8);
        contentPane.add(bilgisayarKart8);

        oyuncuAdi.setFont(new Font("Century", Font.PLAIN, 17));
        oyuncuAdi.setForeground(Color.WHITE);
        oyuncuAdi.setBounds(1594, 36, 89, 30);
        contentPane.add(oyuncuAdi);

        bilgisayarKart1.setBounds(30, 5, 180, 1);
        bilgisayarKart2.setBounds(230, 5, 160, 1);
        bilgisayarKart3.setBounds(400, 5, 160, 1);
        bilgisayarKart4.setBounds(580, 5, 160, 1);
        bilgisayarKart5.setBounds(760, 5, 160, 1);
        bilgisayarKart6.setBounds(940, 5, 160, 1);
        bilgisayarKart7.setBounds(1120, 5, 160, 1);
        bilgisayarKart8.setBounds(1300, 5, 160, 1);

        JLabel oyuncuKart1 = new JLabel("");

        oyuncuKart1.setBounds(30, 683, 180, 300);
        contentPane.add(oyuncuKart1);

        JLabel oyuncuKart2 = new JLabel("");
        oyuncuKart2.setBounds(250, 683, 180, 300);
        contentPane.add(oyuncuKart2);

        JLabel oyuncuKart3 = new JLabel("");
        oyuncuKart3.setBounds(470, 683, 180, 300);
        contentPane.add(oyuncuKart3);

        JLabel oyuncuKart4 = new JLabel("");
        oyuncuKart4.setBounds(690, 683, 180, 300);
        contentPane.add(oyuncuKart4);

        JLabel oyuncuKart5 = new JLabel("");
        oyuncuKart5.setBackground(new Color(240, 240, 240));
        oyuncuKart5.setBounds(910, 683, 180, 300);
        contentPane.add(oyuncuKart5);

        JLabel oyuncuKart6 = new JLabel("");
        oyuncuKart6.setBounds(1130, 683, 180, 300);
        contentPane.add(oyuncuKart6);

        JLabel oyuncuKart7 = new JLabel("");
        oyuncuKart7.setBounds(1350, 683, 180, 300);
        contentPane.add(oyuncuKart7);

        JLabel oyuncuKart8 = new JLabel("");
        oyuncuKart8.setBounds(1570, 683, 180, 300);
        contentPane.add(oyuncuKart8);

        Integer[] arr = new Integer[4];
        for (i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        Collections.shuffle(Arrays.asList(arr));

        for (i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));

        Image pic = new ImageIcon(this.getClass().getResource("/" + oyuncuT.get(0).getSporcuIsim() + ".png")).getImage();
        oyuncuKart1.setIcon(new ImageIcon(pic));
        Image pic2 = new ImageIcon(this.getClass().getResource("/" + oyuncuB.get(0).getSporcuIsim() + ".png")).getImage();
        oyuncuKart2.setIcon(new ImageIcon(pic2));
        Image pic3 = new ImageIcon(this.getClass().getResource("/" + oyuncuT.get(1).getSporcuIsim() + ".png")).getImage();
        oyuncuKart3.setIcon(new ImageIcon(pic3));
        Image pic4 = new ImageIcon(this.getClass().getResource("/" + oyuncuB.get(1).getSporcuIsim() + ".png")).getImage();
        oyuncuKart4.setIcon(new ImageIcon(pic4));
        Image pic5 = new ImageIcon(this.getClass().getResource("/" + oyuncuT.get(2).getSporcuIsim() + ".png")).getImage();
        oyuncuKart5.setIcon(new ImageIcon(pic5));
        Image pic6 = new ImageIcon(this.getClass().getResource("/" + oyuncuB.get(2).getSporcuIsim() + ".png")).getImage();
        oyuncuKart6.setIcon(new ImageIcon(pic6));
        Image pic7 = new ImageIcon(this.getClass().getResource("/" + oyuncuT.get(3).getSporcuIsim() + ".png")).getImage();
        oyuncuKart7.setIcon(new ImageIcon(pic7));
        Image pic8 = new ImageIcon(this.getClass().getResource("/" + oyuncuB.get(3).getSporcuIsim() + ".png")).getImage();
        oyuncuKart8.setIcon(new ImageIcon(pic8));

        JLabel pcskor = new JLabel("");
        pcskor.setFont(new Font("Century", Font.BOLD, 15));
        pcskor.setForeground(Color.WHITE);
        contentPane.add(pcskor);
        pcskor.setBounds(1718, 133, 45, 13);

        JLabel oyuncuskor = new JLabel("");
        oyuncuskor.setFont(new Font("Century", Font.BOLD, 15));
        oyuncuskor.setForeground(Color.WHITE);
        oyuncuskor.setBounds(1715, 41, 82, 25);
        contentPane.add(oyuncuskor);

        JLabel ozellik = new JLabel("");
        ozellik.setFont(new Font("Century", Font.PLAIN, 27));
        ozellik.setForeground(Color.WHITE);
        ozellik.setBounds(1018, 563, 175, 30);
        contentPane.add(ozellik);

        JLabel oyuncu10 = new JLabel("");
        oyuncu10.setFont(new Font("Century", Font.BOLD, 17));
        oyuncu10.setBounds(565, 299, 68, 52);
        contentPane.add(oyuncu10);

        JLabel bilgisayar10 = new JLabel("");
        bilgisayar10.setFont(new Font("Century", Font.BOLD, 17));
        bilgisayar10.setBounds(1254, 289, 56, 47);
        contentPane.add(bilgisayar10);

        oyuncuisim.setVerticalAlignment(SwingConstants.BOTTOM);
        oyuncuisim.setFont(new Font("Century", Font.PLAIN, 30));
        oyuncuisim.setBounds(713, 98, 207, 35);
        contentPane.add(oyuncuisim);

        JLabel arkaplan = new JLabel("");
        Image ab = new ImageIcon(this.getClass().getResource("/ekran2.png")).getImage();
        arkaplan.setIcon(new ImageIcon(ab));
        arkaplan.setBounds(0, 0, 2032, 1041);
        contentPane.add(arkaplan);

        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setBounds(10, 36, 180, 300);
        contentPane.add(lblNewLabel);

        oyuncuKart1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int random = ((int) (Math.random() * 3));
                System.out.print(random);
                oyuncuKart1.setBounds(687, 178, 180, 300);

                System.out.println(oyuncuT.get(0).getSporcuIsim());
                kartlarT.get(arr[0]).setBounds(1029, 177, 180, 300);
                kartlarT.get(arr[0]).setText(pcT.get(arr[0]).getSporcuIsim());

                Image a = new ImageIcon(this.getClass().getResource("/" + pcT.get(arr[0]).getSporcuIsim() + ".png")).getImage();
                kartlarT.get(arr[0]).setIcon(new ImageIcon(a));

                oyuncuKart3.setEnabled(false);
                oyuncuKart5.setEnabled(false);
                oyuncuKart7.setEnabled(false);
                oyuncuKart2.setEnabled(true);
                oyuncuKart4.setEnabled(true);
                oyuncuKart6.setEnabled(true);
                oyuncuKart8.setEnabled(true);

                TimerTask g = new TimerTask() {
                    @Override
                    public void run() {
                        oyuncuKart1.setVisible(false);
                        kartlarT.get(arr[0]).setVisible(false);

                    }
                };
                m.schedule(g, 8000, 1000);

                if (random == 0) {
                    if (kartlarT.get(arr[0]).forhand > oyuncuT.get(0).getForhand()) {
                        bilgisayar10.setText("+10");
                        oyuncu10.setText("   ");
                        ozellik.setText("Forhand");
                        pcSkor += 10;
                        pcskor.setText(Integer.toString(pcSkor));
                    } else if (oyuncuT.get(0).getForhand() > kartlarT.get(arr[0]).forhand) {
                        bilgisayar10.setText(" ");
                        oyuncu10.setText("+10");
                        ozellik.setText("Forhand");
                        oyuncuSkor += 10;
                        oyuncuskor.setText(Integer.toString(oyuncuSkor));
                    } else {
                        ozellik.setText("Forhand");
                        pcSkor += 0;
                        oyuncuSkor += 0;

                        pcskor.setText(Integer.toString(pcSkor));
                        oyuncuskor.setText(Integer.toString(oyuncuSkor));

                        oyuncuKart1.setBounds(30, 683, 180, 300);
                        oyuncuKart1.setVisible(true);
                        kartlarT.get(arr[0]).setVisible(true);
                        kartlarT.get(arr[0]).setBounds(10, 36, 180, 300);

                    }
                } else if (random == 1) {
             
                    if (kartlarT.get(arr[0]).backhand > oyuncuT.get(0).getBackhand()) {
                        bilgisayar10.setText("+10");
                        oyuncu10.setText("   ");
                        ozellik.setText("Backhand");
                        pcSkor += 10;
                        pcskor.setText(Integer.toString(pcSkor));
                    } else if (oyuncuT.get(0).getBackhand() > kartlarT.get(arr[0]).backhand) {
                        bilgisayar10.setText(" ");
                        oyuncu10.setText("+10");
                        ozellik.setText("Backhand");
                        oyuncuSkor += 10;
                        oyuncuskor.setText(Integer.toString(oyuncuSkor));

                    } else {

                        ozellik.setText("Backhand");
                        pcSkor += 0;
                        oyuncuSkor += 0;
                        pcskor.setText(Integer.toString(pcSkor));
                        oyuncuskor.setText(Integer.toString(oyuncuSkor));

                    }
                } else {

                    if (kartlarT.get(arr[0]).servis > oyuncuT.get(0).getServis()) {
                        bilgisayar10.setText("+10");
                        oyuncu10.setText("   ");
                        ozellik.setText("Servis");
                        pcSkor += 10;
                        pcskor.setText(Integer.toString(pcSkor));
                    } else if (oyuncuT.get(0).getServis() > kartlarT.get(arr[0]).servis) {
                        bilgisayar10.setText(" ");
                        oyuncu10.setText("+10");
                        ozellik.setText("Servis");
                        oyuncuSkor += 10;

                        oyuncuskor.setText(Integer.toString(oyuncuSkor));
                    } else {

                        ozellik.setText("Servis");
                        pcSkor += 0;
                        oyuncuSkor += 0;
                        oyuncuKart1.setBounds(30, 683, 180, 300);
                        pcskor.setText(Integer.toString(pcSkor));
                        oyuncuskor.setText(Integer.toString(oyuncuSkor));

                    }

                }

            }
        });

        oyuncuKart2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int random = ((int) (Math.random() * 3));
                oyuncuKart2.setBounds(687, 178, 180, 300);//konumu			
                oyuncuKart2.setText(oyuncuB.get(0).getSporcuIsim());
                kartlarB.get(arr[0]).setBounds(1029, 177, 180, 300);
                kartlarB.get(arr[0]).setText(pcB.get(arr[0]).getSporcuIsim());
                Image pic2 = new ImageIcon(this.getClass().getResource("/" + pcB.get(arr[0]).getSporcuIsim() + ".png")).getImage();
                kartlarB.get(arr[0]).setIcon(new ImageIcon(pic2));

                oyuncuKart4.setEnabled(false);
                oyuncuKart6.setEnabled(false);
                oyuncuKart8.setEnabled(false);
                oyuncuKart1.setEnabled(true);
                oyuncuKart3.setEnabled(true);
                oyuncuKart5.setEnabled(true);
                oyuncuKart7.setEnabled(true);
                TimerTask g = new TimerTask() {
                    @Override
                    public void run() {
                        oyuncuKart2.setVisible(false);
                        kartlarB.get(arr[0]).setVisible(false);
                    }
                };
                m.schedule(g, 6000, 1000);

                if (random == 0) {
                    if (kartlarB.get(arr[0]).ikilik > oyuncuB.get(0).getIkilik()) {
                        bilgisayar10.setText("+10");
                        oyuncu10.setText("   ");
                        ozellik.setText("Ýkilik");
                        pcSkor += 10;
                        pcskor.setText(Integer.toString(pcSkor));
                    } else if (oyuncuB.get(0).getIkilik() > kartlarB.get(arr[0]).ikilik) {
                        bilgisayar10.setText(" ");
                        oyuncu10.setText("+10");
                        ozellik.setText("Ýkilik");
                        oyuncuSkor += 10;
                        oyuncuskor.setText(Integer.toString(oyuncuSkor));
                    } else {

                        ozellik.setText("Ýkilik");
                        pcSkor += 0;
                        oyuncuSkor += 0;
                        pcskor.setText(Integer.toString(pcSkor));
                        oyuncuskor.setText(Integer.toString(oyuncuSkor));
                    }
                } else if (random == 1) {
                    if (kartlarB.get(arr[0]).ucluk > oyuncuB.get(0).getUcluk()) {
                        bilgisayar10.setText("+10");
                        oyuncu10.setText("   ");
                        ozellik.setText("Üçlük");
                        pcSkor += 10;
                        pcskor.setText(Integer.toString(pcSkor));
                    } else if (oyuncuB.get(0).getUcluk() > kartlarB.get(arr[0]).ucluk) {
                        bilgisayar10.setText(" ");
                        oyuncu10.setText("+10");
                        ozellik.setText("Üçlük");
                        oyuncuSkor += 10;
                        oyuncuskor.setText(Integer.toString(oyuncuSkor));

                    } else {

                        ozellik.setText("Üçlük");
                        pcSkor += 0;
                        oyuncuSkor += 0;
                        pcskor.setText(Integer.toString(pcSkor));
                        oyuncuskor.setText(Integer.toString(oyuncuSkor));
                    }
                } else {

                    if (kartlarB.get(arr[0]).serbestAtis > oyuncuB.get(0).getSerbestAtis()) {
                        bilgisayar10.setText("+10");
                        oyuncu10.setText("   ");
                        ozellik.setText("Serbest Atýþ");
                        pcSkor += 10;
                        pcskor.setText(Integer.toString(pcSkor));
                    } else if (oyuncuB.get(0).getSerbestAtis() > kartlarB.get(arr[0]).serbestAtis) {
                        bilgisayar10.setText(" ");
                        oyuncu10.setText("+10");
                        ozellik.setText("Serbest Atýþ");
                        oyuncuSkor += 10;
                        oyuncuskor.setText(Integer.toString(oyuncuSkor));
                    } else {

                        ozellik.setText("Serbest Atýþ");
                        pcSkor += 0;
                        oyuncuSkor += 0;
                        pcskor.setText(Integer.toString(pcSkor));
                        oyuncuskor.setText(Integer.toString(oyuncuSkor));
                    }

                }

            }
        });

        oyuncuKart3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int random = ((int) (Math.random() * 3));
                oyuncuKart3.setBounds(687, 178, 180, 300);
                oyuncuKart3.setText(oyuncuT.get(1).getSporcuIsim());

                kartlarT.get(arr[1]).setBounds(1029, 177, 180, 300);
                kartlarT.get(arr[1]).setText(pcT.get(arr[1]).getSporcuIsim());

                Image pic4 = new ImageIcon(this.getClass().getResource("/" + pcT.get(arr[1]).getSporcuIsim() + ".png")).getImage();
                kartlarT.get(arr[1]).setIcon(new ImageIcon(pic4));
                oyuncuKart1.setEnabled(false);
                oyuncuKart5.setEnabled(false);
                oyuncuKart7.setEnabled(false);
                oyuncuKart2.setEnabled(true);
                oyuncuKart4.setEnabled(true);
                oyuncuKart6.setEnabled(true);
                oyuncuKart8.setEnabled(true);

                TimerTask g = new TimerTask() {
                    @Override
                    public void run() {
                        oyuncuKart3.setVisible(false);
                        kartlarT.get(arr[1]).setVisible(false);
                    }
                };
                m.schedule(g, 6000, 1000);
                if (random == 0) {
                    if (kartlarT.get(arr[1]).forhand > oyuncuT.get(1).getForhand()) {
                        bilgisayar10.setText("+10");
                        oyuncu10.setText("   ");
                        ozellik.setText("Forehand");
                        pcSkor += 10;
                        pcskor.setText(Integer.toString(pcSkor));
                    } else if (oyuncuT.get(1).getForhand() > kartlarT.get(arr[1]).forhand) {
                        bilgisayar10.setText(" ");
                        oyuncu10.setText("+10");
                        ozellik.setText("Forehand");
                        oyuncuSkor += 10;
                        oyuncuskor.setText(Integer.toString(oyuncuSkor));
                    } else {

                        ozellik.setText("Forehand");
                        pcSkor += 0;
                        oyuncuSkor += 0;
                        pcskor.setText(Integer.toString(pcSkor));
                        oyuncuskor.setText(Integer.toString(oyuncuSkor));
                    }
                } else if (random == 1) {
                    System.out.print(kartlarT.get(arr[1]).forhand);
                    System.out.print(oyuncuT.get(arr[1]).getForhand());
                    if (kartlarT.get(arr[1]).backhand > oyuncuT.get(1).getBackhand()) {
                        bilgisayar10.setText("+10");
                        oyuncu10.setText("   ");
                        ozellik.setText("Backhand");
                        pcSkor += 10;
                        pcskor.setText(Integer.toString(pcSkor));
                    } else if (oyuncuT.get(1).getBackhand() > kartlarT.get(arr[1]).backhand) {
                        bilgisayar10.setText(" ");
                        oyuncu10.setText("+10");
                        ozellik.setText("Backhand");
                        oyuncuSkor += 10;
                        oyuncuskor.setText(Integer.toString(oyuncuSkor));

                    } else {
                        ozellik.setText("Backhand");

                        pcSkor += 0;
                        oyuncuSkor += 0;
                        pcskor.setText(Integer.toString(pcSkor));
                        oyuncuskor.setText(Integer.toString(oyuncuSkor));
                    }
                } else {

                    if (kartlarT.get(arr[1]).servis > oyuncuT.get(1).getServis()) {
                        bilgisayar10.setText("+10");
                        oyuncu10.setText("   ");
                        ozellik.setText("Servis");
                        pcSkor += 10;
                        pcskor.setText(Integer.toString(pcSkor));
                    } else if (oyuncuT.get(1).getServis() > kartlarT.get(arr[1]).servis) {
                        bilgisayar10.setText(" ");
                        oyuncu10.setText("+10");
                        ozellik.setText("Servis");
                        oyuncuSkor += 10;
                        oyuncuskor.setText(Integer.toString(oyuncuSkor));
                    } else {

                        ozellik.setText("Servis");
                        pcSkor += 0;
                        oyuncuSkor += 0;
                        pcskor.setText(Integer.toString(pcSkor));
                        oyuncuskor.setText(Integer.toString(oyuncuSkor));
                    }

                }

            }
        });

        oyuncuKart4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int random = ((int) (Math.random() * 3));
                oyuncuKart4.setBounds(687, 178, 180, 300);
                oyuncuKart4.setText(oyuncuB.get(1).getSporcuIsim());

                kartlarB.get(arr[1]).setBounds(1029, 177, 180, 300);
                kartlarB.get(arr[1]).setText(pcB.get(arr[1]).getSporcuIsim());
                Image pic2 = new ImageIcon(this.getClass().getResource("/" + pcB.get(arr[1]).getSporcuIsim() + ".png")).getImage();
                kartlarB.get(arr[1]).setIcon(new ImageIcon(pic2));

                System.out.println(oyuncuB.get(1).getSporcuIsim());
                System.out.println("ikilik:" + oyuncuB.get(1).getIkilik());
                System.out.println("üclük:" + oyuncuB.get(1).getUcluk());
                System.out.println("serbest" + oyuncuB.get(1).getSerbestAtis());
                System.out.println(kartlarB.get(arr[1]).ad);
                System.out.println("ikilik:" + kartlarB.get(arr[1]).ikilik);
                System.out.println("üclük:" + kartlarB.get(arr[1]).ucluk);
                System.out.println("serbest" + kartlarB.get(arr[1]).serbestAtis);

                oyuncuKart2.setEnabled(false);
                oyuncuKart6.setEnabled(false);
                oyuncuKart8.setEnabled(false);
                oyuncuKart1.setEnabled(true);
                oyuncuKart3.setEnabled(true);
                oyuncuKart5.setEnabled(true);
                oyuncuKart7.setEnabled(true);

                TimerTask g = new TimerTask() {
                    @Override
                    public void run() {
                        oyuncuKart4.setVisible(false);
                        kartlarB.get(arr[1]).setVisible(false);
                    }
                };
                m.schedule(g, 20000, 1000);

                if (random == 0) {

                    ozellik.setText("Ýkilik");
                    System.out.println("Ýkilik");
                    if (kartlarB.get(arr[1]).ikilik > oyuncuB.get(1).getIkilik()) {
                        bilgisayar10.setText("+10");
                        oyuncu10.setText("   ");
                        System.out.println(kartlarB.get(arr[1]).ikilik + ">" + oyuncuB.get(1).getIkilik());
                        System.out.println("bilgisayar büyük");
                        pcSkor += 10;
                        pcskor.setText(Integer.toString(pcSkor));
                    } else if (oyuncuB.get(1).getIkilik() > kartlarB.get(arr[1]).ikilik) {
                        System.out.println("oyuncu büyük");
                        System.out.println(oyuncuB.get(1).getIkilik() + ">" + kartlarB.get(arr[1]).ikilik);
                        oyuncu10.setText("+10");
                        bilgisayar10.setText("   ");
                        oyuncuSkor += 10;
                        oyuncuskor.setText(Integer.toString(oyuncuSkor));
                    } else {
                        System.out.println("eþit");
                        System.out.println(oyuncuB.get(1).getIkilik() + "=" + kartlarB.get(arr[1]).ikilik);
                        pcSkor += 0;
                        oyuncuSkor += 0;
                        pcskor.setText(Integer.toString(pcSkor));
                        oyuncuskor.setText(Integer.toString(oyuncuSkor));
                    }
                } else if (random == 1) {
                    ozellik.setText("Üçlük");
                    System.out.println("Üçlük");
                    if (kartlarB.get(arr[1]).ucluk > oyuncuB.get(1).getUcluk()) {
                        bilgisayar10.setText("+10");
                        oyuncu10.setText("   ");
                        System.out.println(kartlarB.get(arr[1]).ucluk + ">" + oyuncuB.get(1).getUcluk());
                        System.out.println("bilgisayar büyük");
                        pcSkor += 10;
                        pcskor.setText(Integer.toString(pcSkor));
                    } else if (oyuncuB.get(1).getUcluk() > kartlarB.get(arr[1]).ucluk) {
                        System.out.println("oyuncu büyük");
                        System.out.println(oyuncuB.get(1).getUcluk() + ">" + kartlarB.get(arr[1]).ucluk);
                        oyuncu10.setText("+10");
                        bilgisayar10.setText("   ");
                        oyuncuSkor += 10;
                        oyuncuskor.setText(Integer.toString(oyuncuSkor));

                    } else {
                        System.out.println(oyuncuB.get(1).getUcluk() + "=" + kartlarB.get(arr[1]).ucluk);
                        System.out.println("eþit");
                        pcSkor += 0;
                        oyuncuSkor += 0;
                        pcskor.setText(Integer.toString(pcSkor));
                        oyuncuskor.setText(Integer.toString(oyuncuSkor));
                    }
                } else {
                    ozellik.setText("Serbest Atýþ");
                    System.out.println("Serbest Atýþ");

                    if (kartlarB.get(arr[1]).serbestAtis > oyuncuB.get(1).getSerbestAtis()) {
                        bilgisayar10.setText("+10");
                        oyuncu10.setText("   ");
                        System.out.println(kartlarB.get(arr[1]).serbestAtis + ">" + oyuncuB.get(1).getSerbestAtis());
                        System.out.println("bilgisayar büyük");

                        pcSkor += 10;
                        pcskor.setText(Integer.toString(pcSkor));
                    } else if (oyuncuB.get(1).getSerbestAtis() > kartlarB.get(arr[1]).serbestAtis) {
                        System.out.println(oyuncuB.get(1).getSerbestAtis() + ">" + kartlarB.get(arr[1]).serbestAtis);
                        System.out.println("oyuncu büyük");
                        oyuncu10.setText("+10");
                        bilgisayar10.setText("   ");
                        oyuncuSkor += 10;
                        oyuncuskor.setText(Integer.toString(oyuncuSkor));
                    } else {

                        System.out.println(oyuncuB.get(1).getSerbestAtis() + "=" + kartlarB.get(arr[1]).serbestAtis);
                        System.out.println("eþit");
                        pcSkor += 0;
                        oyuncuSkor += 0;
                        pcskor.setText(Integer.toString(pcSkor));
                        oyuncuskor.setText(Integer.toString(oyuncuSkor));
                    }

                }
            }
        });

        oyuncuKart5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int random = ((int) (Math.random() * 3));
                oyuncuKart5.setBounds(687, 178, 180, 300);
                oyuncuKart5.setText(oyuncuT.get(2).getSporcuIsim());

                kartlarT.get(arr[2]).setBounds(1029, 177, 180, 300);
                kartlarT.get(arr[2]).setText(pcT.get(arr[2]).getSporcuIsim());

                Image pic2 = new ImageIcon(this.getClass().getResource("/" + pcT.get(arr[2]).getSporcuIsim() + ".png")).getImage();
                kartlarT.get(arr[2]).setIcon(new ImageIcon(pic2));
                oyuncuKart1.setEnabled(false);
                oyuncuKart3.setEnabled(false);
                oyuncuKart7.setEnabled(false);
                oyuncuKart2.setEnabled(true);
                oyuncuKart4.setEnabled(true);
                oyuncuKart6.setEnabled(true);
                oyuncuKart8.setEnabled(true);
                TimerTask g = new TimerTask() {
                    @Override
                    public void run() {
                        oyuncuKart5.setVisible(false);
                        kartlarT.get(arr[2]).setVisible(false);
                    }
                };
                m.schedule(g, 6000, 1000);

                if (random == 0) {
                    if (kartlarT.get(arr[2]).forhand > oyuncuT.get(2).getForhand()) {
                        bilgisayar10.setText("+10");
                        oyuncu10.setText("   ");
                        ozellik.setText("Forehand");
                        pcSkor += 10;
                        pcskor.setText(Integer.toString(pcSkor));
                    } else if (oyuncuT.get(2).getForhand() > kartlarT.get(arr[2]).forhand) {
                        oyuncu10.setText("+10");
                        bilgisayar10.setText("   ");
                        ozellik.setText("Forehand");
                        oyuncuSkor += 10;
                        oyuncuskor.setText(Integer.toString(oyuncuSkor));
                    } else {
                        ozellik.setText("Forehand");
                        pcSkor += 0;
                        oyuncuSkor += 0;
                        pcskor.setText(Integer.toString(pcSkor));
                        oyuncuskor.setText(Integer.toString(oyuncuSkor));
                    }
                } else if (random == 1) {
                    if (kartlarT.get(arr[2]).backhand > oyuncuT.get(2).getBackhand()) {
                        bilgisayar10.setText("+10");
                        oyuncu10.setText("   ");
                        ozellik.setText("Backhand");
                        pcSkor += 10;
                        pcskor.setText(Integer.toString(pcSkor));
                    } else if (oyuncuT.get(2).getBackhand() > kartlarT.get(arr[2]).backhand) {
                        oyuncu10.setText("+10");
                        bilgisayar10.setText("   ");
                        ozellik.setText("Backhand");
                        oyuncuSkor += 10;
                        oyuncuskor.setText(Integer.toString(oyuncuSkor));

                    } else {
                        ozellik.setText("Backhand");
                        pcSkor += 0;
                        oyuncuSkor += 0;
                        pcskor.setText(Integer.toString(pcSkor));
                        oyuncuskor.setText(Integer.toString(oyuncuSkor));
                    }
                } else {

                    if (kartlarT.get(arr[2]).servis > oyuncuT.get(2).getServis()) {
                        bilgisayar10.setText("+10");
                        oyuncu10.setText("   ");
                        ozellik.setText("Servis");
                        pcSkor += 10;
                        pcskor.setText(Integer.toString(pcSkor));
                    } else if (oyuncuT.get(2).getServis() > kartlarT.get(arr[2]).servis) {
                        oyuncu10.setText("+10");
                        bilgisayar10.setText("   ");
                        ozellik.setText("Servis");
                        oyuncuSkor += 10;
                        oyuncuskor.setText(Integer.toString(oyuncuSkor));
                    } else {
                        ozellik.setText("Servis");
                        pcSkor += 0;
                        oyuncuSkor += 0;
                        pcskor.setText(Integer.toString(pcSkor));
                        oyuncuskor.setText(Integer.toString(oyuncuSkor));
                    }

                }

            }
        });
        oyuncuKart6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int random = ((int) (Math.random() * 3));
                oyuncuKart6.setBounds(687, 178, 180, 300);
                oyuncuKart6.setText(oyuncuB.get(2).getSporcuIsim());

                kartlarB.get(arr[2]).setBounds(1029, 177, 180, 300);
                kartlarB.get(arr[2]).setText(pcB.get(arr[2]).getSporcuIsim());

                Image pic2 = new ImageIcon(this.getClass().getResource("/" + pcB.get(arr[2]).getSporcuIsim() + ".png")).getImage();
                kartlarB.get(arr[2]).setIcon(new ImageIcon(pic2));
                oyuncuKart2.setEnabled(false);
                oyuncuKart4.setEnabled(false);
                oyuncuKart8.setEnabled(false);
                oyuncuKart1.setEnabled(true);
                oyuncuKart3.setEnabled(true);
                oyuncuKart5.setEnabled(true);
                oyuncuKart7.setEnabled(true);
                TimerTask g = new TimerTask() {
                    @Override
                    public void run() {
                        oyuncuKart6.setVisible(false);
                        kartlarB.get(arr[2]).setVisible(false);
                    }
                };
                m.schedule(g, 6000, 1000);

                if (random == 0) {
                    if (kartlarB.get(arr[2]).ikilik > oyuncuB.get(2).getIkilik()) {
                        bilgisayar10.setText("+10");
                        oyuncu10.setText("   ");
                        ozellik.setText("Ýkilik");
                        pcSkor += 10;
                        pcskor.setText(Integer.toString(pcSkor));
                    } else if (oyuncuB.get(2).getIkilik() > kartlarB.get(arr[2]).ikilik) {
                        oyuncu10.setText("+10");
                        bilgisayar10.setText("   ");
                        ozellik.setText("Ýkilik");
                        oyuncuSkor += 10;
                        oyuncuskor.setText(Integer.toString(oyuncuSkor));
                    } else {

                        ozellik.setText("Ýkilik");
                        pcSkor += 0;
                        oyuncuSkor += 0;
                        pcskor.setText(Integer.toString(pcSkor));
                        oyuncuskor.setText(Integer.toString(oyuncuSkor));
                    }
                } else if (random == 1) {
                    if (kartlarB.get(arr[2]).ucluk > oyuncuB.get(2).getUcluk()) {
                        bilgisayar10.setText("+10");
                        oyuncu10.setText("   ");
                        ozellik.setText("Üçlük");
                        pcSkor += 10;
                        pcskor.setText(Integer.toString(pcSkor));
                    } else if (oyuncuB.get(2).getUcluk() > kartlarB.get(arr[2]).ucluk) {
                        oyuncu10.setText("+10");
                        bilgisayar10.setText("   ");
                        ozellik.setText("Üçlük");
                        oyuncuSkor += 10;
                        oyuncuskor.setText(Integer.toString(oyuncuSkor));

                    } else {

                        ozellik.setText("Üçlük");
                        pcSkor += 0;
                        oyuncuSkor += 0;
                        pcskor.setText(Integer.toString(pcSkor));
                        oyuncuskor.setText(Integer.toString(oyuncuSkor));
                    }
                } else {

                    if (kartlarB.get(arr[2]).serbestAtis > oyuncuB.get(2).getSerbestAtis()) {
                        bilgisayar10.setText("+10");
                        oyuncu10.setText("   ");
                        ozellik.setText("Serbest Atýþ");
                        pcSkor += 10;
                        pcskor.setText(Integer.toString(pcSkor));
                    } else if (oyuncuB.get(2).getSerbestAtis() > kartlarB.get(arr[2]).serbestAtis) {
                        oyuncu10.setText("+10");
                        bilgisayar10.setText("   ");
                        ozellik.setText("Serbest Atýþ");
                        oyuncuSkor += 10;
                        oyuncuskor.setText(Integer.toString(oyuncuSkor));
                    } else {

                        ozellik.setText("Serbest Atýþ");
                        pcSkor += 0;
                        oyuncuSkor += 0;
                        pcskor.setText(Integer.toString(pcSkor));
                        oyuncuskor.setText(Integer.toString(oyuncuSkor));
                    }

                }
            }
        });

        oyuncuKart7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int random = ((int) (Math.random() * 3));
                oyuncuKart7.setBounds(687, 178, 180, 300);
                oyuncuKart7.setText(oyuncuT.get(3).getSporcuIsim());

                kartlarT.get(arr[3]).setBounds(1029, 177, 180, 300);
                kartlarT.get(arr[3]).setText(pcT.get(arr[3]).getSporcuIsim());

                Image pic2 = new ImageIcon(this.getClass().getResource("/" + pcT.get(arr[3]).getSporcuIsim() + ".png")).getImage();
                kartlarT.get(arr[3]).setIcon(new ImageIcon(pic2));
                oyuncuKart1.setEnabled(false);
                oyuncuKart3.setEnabled(false);
                oyuncuKart5.setEnabled(false);
                oyuncuKart2.setEnabled(true);
                oyuncuKart4.setEnabled(true);
                oyuncuKart6.setEnabled(true);
                oyuncuKart8.setEnabled(true);

                TimerTask g = new TimerTask() {
                    @Override
                    public void run() {
                        oyuncuKart7.setVisible(false);
                        kartlarT.get(arr[3]).setVisible(false);
                    }
                };

                m.schedule(g, 8000, 1000);

                if (random == 0) {
                    if (kartlarT.get(arr[3]).forhand > oyuncuT.get(3).getForhand()) {
                        bilgisayar10.setText("+10");
                        oyuncu10.setText("   ");
                        ozellik.setText("Forhand");
                        pcSkor += 10;
                        pcskor.setText(Integer.toString(pcSkor));
                    } else if (oyuncuT.get(3).getForhand() > kartlarT.get(arr[3]).forhand) {
                        oyuncu10.setText("+10");
                        bilgisayar10.setText("   ");
                        ozellik.setText("Forhand");
                        oyuncuSkor += 10;
                        oyuncuskor.setText(Integer.toString(oyuncuSkor));
                    } else {
                        ozellik.setText("Forhand");
                        pcSkor += 0;
                        oyuncuSkor += 0;
                        pcskor.setText(Integer.toString(pcSkor));
                        oyuncuskor.setText(Integer.toString(oyuncuSkor));
                    }
                } else if (random == 1) {
                    System.out.print(kartlarT.get(arr[3]).forhand);
                    System.out.print(oyuncuT.get(arr[3]).getForhand());
                    if (kartlarT.get(arr[3]).backhand > oyuncuT.get(3).getBackhand()) {
                        bilgisayar10.setText("+10");
                        oyuncu10.setText("   ");
                        ozellik.setText("Backhand");
                        pcSkor += 10;
                        pcskor.setText(Integer.toString(pcSkor));
                    } else if (oyuncuT.get(3).getBackhand() > kartlarT.get(arr[3]).backhand) {
                        oyuncu10.setText("+10");
                        bilgisayar10.setText("   ");
                        ozellik.setText("Backhand");
                        oyuncuSkor += 10;
                        oyuncuskor.setText(Integer.toString(oyuncuSkor));

                    } else {

                        ozellik.setText("Backhand");
                        pcSkor += 0;
                        oyuncuSkor += 0;
                        pcskor.setText(Integer.toString(pcSkor));
                        oyuncuskor.setText(Integer.toString(oyuncuSkor));
                    }
                } else {

                    if (kartlarT.get(arr[3]).servis > oyuncuT.get(3).getServis()) {
                        bilgisayar10.setText("+10");
                        oyuncu10.setText("   ");
                        ozellik.setText("Servis");
                        pcSkor += 10;
                        pcskor.setText(Integer.toString(pcSkor));
                    } else if (oyuncuT.get(3).getServis() > kartlarT.get(arr[3]).servis) {
                        oyuncu10.setText("+10");
                        bilgisayar10.setText("   ");
                        ozellik.setText("Servis");
                        oyuncuSkor += 10;
                        oyuncuskor.setText(Integer.toString(oyuncuSkor));
                    } else {

                        ozellik.setText("Servis");
                        pcSkor += 0;
                        oyuncuSkor += 0;
                        pcskor.setText(Integer.toString(pcSkor));
                        oyuncuskor.setText(Integer.toString(oyuncuSkor));
                    }

                }
            }
        });

        oyuncuKart8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int random = ((int) (Math.random() * 3));
                oyuncuKart8.setBounds(687, 178, 180, 300);
                oyuncuKart8.setText(oyuncuB.get(3).getSporcuIsim());
                kartlarB.get(arr[3]).setBounds(1029, 177, 180, 300);
                kartlarB.get(arr[3]).setText(pcB.get(arr[3]).getSporcuIsim());
                oyuncuKart2.setEnabled(false);
                oyuncuKart4.setEnabled(false);
                oyuncuKart6.setEnabled(false);
                oyuncuKart1.setEnabled(true);
                oyuncuKart3.setEnabled(true);
                oyuncuKart5.setEnabled(true);
                oyuncuKart7.setEnabled(true);

                Image pic2 = new ImageIcon(this.getClass().getResource("/" + pcB.get(arr[3]).getSporcuIsim() + ".png")).getImage();
                kartlarB.get(arr[3]).setIcon(new ImageIcon(pic2));

                TimerTask g = new TimerTask() {
                    @Override
                    public void run() {
                        oyuncuKart8.setVisible(false);
                        kartlarB.get(arr[3]).setVisible(false);
                    }
                };
                m.schedule(g, 6000, 1000);

                if (random == 0) {
                    if (kartlarB.get(arr[3]).ikilik > oyuncuB.get(3).getIkilik()) {
                        bilgisayar10.setText("+10");
                        oyuncu10.setText("   ");
                        ozellik.setText("Ýkilik");
                        pcSkor += 10;
                        pcskor.setText(Integer.toString(pcSkor));
                    } else if (oyuncuB.get(3).getIkilik() > kartlarB.get(arr[3]).ikilik) {
                        oyuncu10.setText("+10");
                        bilgisayar10.setText("   ");
                        ozellik.setText("Ýkilik");
                        oyuncuSkor += 10;
                        oyuncuskor.setText(Integer.toString(oyuncuSkor));
                    } else {

                        ozellik.setText("Ýkilik");
                        pcSkor += 0;
                        oyuncuSkor += 0;
                        pcskor.setText(Integer.toString(pcSkor));
                        oyuncuskor.setText(Integer.toString(oyuncuSkor));
                    }
                } else if (random == 1) {
                    if (kartlarB.get(arr[3]).ucluk > oyuncuB.get(3).getUcluk()) {
                        bilgisayar10.setText("+10");
                        oyuncu10.setText("   ");
                        ozellik.setText("Üçlük");
                        pcSkor += 10;
                        pcskor.setText(Integer.toString(pcSkor));
                    } else if (oyuncuB.get(3).getUcluk() > kartlarB.get(arr[3]).ucluk) {
                        oyuncu10.setText("+10");
                        bilgisayar10.setText("   ");
                        ozellik.setText("Üçlük");
                        oyuncuSkor += 10;
                        oyuncuskor.setText(Integer.toString(oyuncuSkor));

                    } else {

                        ozellik.setText("Üçlük");
                        pcSkor += 0;
                        oyuncuSkor += 0;
                        pcskor.setText(Integer.toString(pcSkor));
                        oyuncuskor.setText(Integer.toString(oyuncuSkor));
                    }
                } else {

                    if (kartlarB.get(arr[3]).serbestAtis > oyuncuB.get(3).getSerbestAtis()) {
                        bilgisayar10.setText("+10");
                        oyuncu10.setText("   ");
                        ozellik.setText("Serbest Atýþ");
                        pcSkor += 10;
                        pcskor.setText(Integer.toString(pcSkor));
                    } else if (oyuncuB.get(3).getSerbestAtis() > kartlarB.get(arr[3]).serbestAtis) {
                        oyuncu10.setText("+10");
                        bilgisayar10.setText("   ");
                        ozellik.setText("Serbest Atýþ");
                        oyuncuSkor += 10;
                        oyuncuskor.setText(Integer.toString(oyuncuSkor));
                    } else {

                        ozellik.setText("Serbest Atýþ");
                        pcSkor += 0;
                        oyuncuSkor += 0;
                        pcskor.setText(Integer.toString(pcSkor));
                        oyuncuskor.setText(Integer.toString(oyuncuSkor));
                    }

                }
            }
        });

    }
}

