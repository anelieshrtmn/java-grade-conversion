import javax.swing.*;
import javax.swing.text.Position;
import javax.swing.text.DefaultEditorKit.InsertBreakAction;

import java.awt.*;
import java.awt.event.*;  

// Deklarasi kelas KonversiNilai
// Pewarisan atribut JFrame
public class KonversiNilai extends JFrame implements ActionListener{   
	
    JTextField 
	name,
	id,
	homework,
	quiz,
	midtest,
	finaltest,
	project;
    
	JButton 
	button1,
	button2;
	
	JLabel 
	label,
	label2, 
	lb_nama, 
	lb_nim, 
	lb_tugas,
	lb_kuis,
	lb_uts,
	lb_uas,
	lb_proyek,
	lb_getnama,
	lb_getnim,
	lb_getmatkul,
	lb_getrata2,
	lb_getgrade,
	lb_getpred,
	grade,
	predikat;
	
    KonversiNilai(){  

		// Membuat tampilan label
		label=new JLabel("PROGRAM KONVERSI NILAI");
		label.setBounds(250,50, 400,30);
		label.setFont(new Font ("Arial", Font.BOLD, 24));
		label.setForeground(new Color(128, 0, 0));
		
		lb_nama=new JLabel("Nama : ");  
		lb_nama.setBounds(295,110, 100,30); 
		lb_nama.setFont(new Font ("Arial", Font.BOLD, 14)); 
		
		lb_nim=new JLabel("NIM : ");  
		lb_nim.setBounds(305,160, 100,30);
		lb_nim.setFont(new Font ("Arial", Font.BOLD, 14));
		
		lb_tugas=new JLabel("Nilai Tugas : ");  
		lb_tugas.setBounds(220,210, 100,30);
		lb_tugas.setFont(new Font ("Arial", Font.BOLD, 14));
		
		lb_kuis=new JLabel("Nilai Kuis : ");  
		lb_kuis.setBounds(229,260, 100,30);
		lb_kuis.setFont(new Font ("Arial", Font.BOLD, 14));

		lb_proyek=new JLabel("Nilai Proyek : ");  
		lb_proyek.setBounds(212,310, 100,30);
		lb_proyek.setFont(new Font ("Arial", Font.BOLD, 14));

		lb_uts=new JLabel("Nilai UTS : ");  
		lb_uts.setBounds(422,210, 100,30);
		lb_uts.setFont(new Font ("Arial", Font.BOLD, 14));

		lb_uas=new JLabel("Nilai UAS : ");  
		lb_uas.setBounds(422,260, 100,30);
		lb_uas.setFont(new Font ("Arial", Font.BOLD, 14));

		// Membuat tampilan JTextField sebagai tempat input
        name=new JTextField();  
        name.setBounds(350,115,150,20);  
		
        id=new JTextField();  
        id.setBounds(350,165,150,20);

		homework=new JTextField();  
        homework.setBounds(310,215,40,20);
		
		quiz=new JTextField();  
        quiz.setBounds(310,265,40,20);
		
		midtest=new JTextField();  
        midtest.setBounds(310,315,40,20);

		finaltest=new JTextField();  
        finaltest.setBounds(500,215,40,20);

		project=new JTextField();  
        project.setBounds(500,265,40,20);

		lb_getnama=new JLabel();  
        lb_getnama.setBounds(295,440,200,20);  
		lb_getnama.setFont(new Font ("Arial", Font.BOLD, 14));

		lb_getnim=new JLabel();  
        lb_getnim.setBounds(295,460,200,20);
		lb_getnim.setFont(new Font ("Arial", Font.BOLD, 14));

		lb_getmatkul=new JLabel();  
        lb_getmatkul.setBounds(295,480,800,20);
		lb_getmatkul.setFont(new Font ("Arial", Font.BOLD, 14));  

		lb_getrata2=new JLabel();  
        lb_getrata2.setBounds(295,500,150,20);
		lb_getrata2.setFont(new Font ("Arial", Font.BOLD, 14));  

		lb_getgrade=new JLabel();  
        lb_getgrade.setBounds(295,520,150,20);
		lb_getgrade.setFont(new Font ("Arial", Font.BOLD, 14));  

		lb_getpred=new JLabel();  
        lb_getpred.setBounds(295,540,300,20);
		lb_getpred.setFont(new Font ("Arial", Font.BOLD, 14)); 

		grade=new JLabel();  
        grade.setBounds(295,550,150,20);
		grade.setFont(new Font ("Arial", Font.BOLD, 14)); 

		predikat=new JLabel();  
        predikat.setBounds(295,570,150,20); 
		predikat.setFont(new Font ("Arial", Font.BOLD, 14));   

		button1=new JButton("Konversi");  
        button1.setBounds(250,360,100,50);  
        button1.addActionListener(this);

		button2=new JButton("Restart");  
        button2.setBounds(450,360,100,50);  
        button2.addActionListener(this);        
		
        add(label); 
		add(lb_nama); 
		add(lb_nim); 
		add(lb_tugas); 
		add(lb_kuis); 
		add(lb_uts); 
		add(lb_uas); 
		add(lb_proyek);
		add(name); 
		add(id); 
		add(homework); 
		add(quiz);
		add(midtest); 
		add(finaltest); 
		add(project);
		add(lb_getnama);
		add(lb_getnim);
		add(lb_getrata2);
		add(lb_getmatkul);
		add(lb_getgrade);
		add(lb_getpred);
		add(button1);
		add(button2);
		
		// Mengatur Frame
        setSize(850,700);
        setTitle("KELOMPOK 4");
        setLayout(null);  
        setVisible(true);
		setLocationRelativeTo(null); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Membuat tampilan JComboBox
		String matkul[]={"==Pilih Mata Kuliah==",
		"Pemrograman Komputer",
		"Pengantar Teori Grup",
		"Analisis Riil",
		"Persamaan Diferensial Biasa",
		"Kalkulus Lanjut",
		"Matematika Diskrit",
		"Geometri Analitik"}; 

		final JComboBox cb=new JComboBox(matkul);    
		cb.setBounds(421,315, 200,20);    
		add(cb);

		// Menampilkan selected item dari ComboBox
		button1.addActionListener(new ActionListener() {  
			public void actionPerformed(ActionEvent e) {       
				String data = "Mata Kuliah : "  + cb.getItemAt(cb.getSelectedIndex());  
				lb_getmatkul.setText(data); }  
		});

		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name.setText("");
				id.setText("");
				homework.setText("");
				quiz.setText("");
				midtest.setText("");
				finaltest.setText("");
				project.setText("");
				lb_getnama.setText("");
				lb_getnim.setText("");
				lb_getrata2.setText("");
				lb_getmatkul.setText("");
				lb_getgrade.setText("");
				lb_getpred.setText("");
			}
		});
    
	}
		public void actionPerformed(ActionEvent e) {  
			String s1=name.getText();  
			String s2=id.getText();
			String s3=homework.getText();
			String s4=quiz.getText();
			String s5=midtest.getText();
			String s6=finaltest.getText();
			String s7=project.getText();
			// Konversi ke Integer 
			int skortugas = Integer.parseInt(s3);
			int skorkuis = Integer.parseInt(s4);
			int skoruts = Integer.parseInt(s5);
			int skoruas = Integer.parseInt(s6);  
			int skorproyek = Integer.parseInt(s7);
			float x = 0;
			if(e.getSource()==button1) {
				// Menghitung rata-rata nilai yang telah diinput
				x = (skortugas+skorkuis+skoruts+skoruas+skorproyek)/5;
				// Kondisi dari nilai rata-rata
				if (x >= 86) {
					grade.setText("A");
					predikat.setText("Lulus");
				} else if (x <= 85 && x >= 76) {
					grade.setText("AB");
					predikat.setText("Lulus");
				} else if (x <= 75 && x >= 66) {
					grade.setText("B");
					predikat.setText("Lulus");
				} else if (x <= 65 && x >= 59 ) {
					grade.setText("BC");
					predikat.setText("Lulus");
				} else if (x <= 58 && x >= 51) {
					grade.setText("C");
					predikat.setText("Lulus");
				} else if (x <= 50 && x >= 43) {
					grade.setText("D");
					predikat.setText("Tidak Lulus");
				} else if (x <= 42) {
					grade.setText("E");
					predikat.setText("Tidak Lulus");
				}
		    }

			//Menampilkan hasil input dari data KonversiNilai dengan JLabel
			try {
				String nama = s1;
				lb_getnama.setText("Nama : " + nama);

				String nim = s2;
				lb_getnim.setText("NIM : " + nim);

				String nilai = String.valueOf(x);
				lb_getrata2.setText("Nilai Rata-rata : " + nilai);

				String y = grade.getText(); 
				lb_getgrade.setText("Grade : " + y);

				String z = predikat.getText();
				lb_getpred.setText("Keterangan : " + z);

				} catch(Exception ex){System.out.println(ex);}
			}

	public static void main(String[] args){   
    	new KonversiNilai();  
	
	} 
}