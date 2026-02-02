import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Grades extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel mainPane;
	private JTextField field_IDNO;
	private JTextField field_SHSSTRAND;
	private JTextField field_Grade;
	private JTextField textField_2;
	private JTextField field_NameFamily;
	private JTextField field_NameFirst;
	private JTextField field_NameMiddle;
	private JTextField txtExampleexamplecom;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField LB_PIRTHPLACE;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_11;
	private JTextField textField_7;
	private JTextField textField;
	private JTextField textField_10;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_27;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Grades frame = new Grades();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Grades() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1182, 877);
		mainPane = new JPanel();
		mainPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainPane);
		mainPane.setLayout(null);
		
		JLabel LB_BCT = new JLabel("Baguio College of Technology");
		LB_BCT.setFont(new Font("Dialog", Font.BOLD, 20));
		LB_BCT.setBounds(14, 12, 337, 24);
		mainPane.add(LB_BCT);
		
		JLabel LB_SEMESTER = new JLabel("Semester:");
		LB_SEMESTER.setFont(new Font("Dialog", Font.BOLD, 14));
		LB_SEMESTER.setBounds(49, 48, 82, 17);
		mainPane.add(LB_SEMESTER);
		
		JComboBox comboBox_Semester = new JComboBox();
		comboBox_Semester.setBounds(140, 44, 32, 24);
		mainPane.add(comboBox_Semester);
		
		JLabel LB_SCHOOLYEAR = new JLabel("School Year:");
		LB_SCHOOLYEAR.setFont(new Font("Dialog", Font.BOLD, 14));
		LB_SCHOOLYEAR.setBounds(231, 48, 100, 17);
		mainPane.add(LB_SCHOOLYEAR);
		
		JLabel LB_DATE = new JLabel("Date:");
		LB_DATE.setFont(new Font("Dialog", Font.BOLD, 14));
		LB_DATE.setBounds(437, 49, 42, 17);
		mainPane.add(LB_DATE);
		
		JComboBox comboBox_SchoolYear = new JComboBox();
		comboBox_SchoolYear.setBounds(349, 48, 32, 24);
		mainPane.add(comboBox_SchoolYear);
		
		JLabel LB_IDNO = new JLabel("Id. No:");
		LB_IDNO.setFont(new Font("Dialog", Font.BOLD, 14));
		LB_IDNO.setBounds(49, 80, 51, 17);
		mainPane.add(LB_IDNO);
		
		field_IDNO = new JTextField();
		field_IDNO.setBounds(106, 80, 114, 19);
		mainPane.add(field_IDNO);
		field_IDNO.setColumns(10);
		
		JLabel LB_SHS_STRAND = new JLabel("SHS Strand:");
		LB_SHS_STRAND.setFont(new Font("Dialog", Font.BOLD, 14));
		LB_SHS_STRAND.setBounds(249, 80, 94, 17);
		mainPane.add(LB_SHS_STRAND);
		
		field_SHSSTRAND = new JTextField();
		field_SHSSTRAND.setColumns(10);
		field_SHSSTRAND.setBounds(344, 80, 135, 19);
		mainPane.add(field_SHSSTRAND);
		
		JLabel LB_GRADE = new JLabel("Grade:");
		LB_GRADE.setFont(new Font("Dialog", Font.BOLD, 14));
		LB_GRADE.setBounds(493, 80, 54, 17);
		mainPane.add(LB_GRADE);
		
		field_Grade = new JTextField();
		field_Grade.setColumns(10);
		field_Grade.setBounds(550, 80, 50, 19);
		mainPane.add(field_Grade);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(699, 80, 174, 19);
		mainPane.add(textField_2);
		
		JLabel LB_NAME = new JLabel("Name:");
		LB_NAME.setFont(new Font("Dialog", Font.BOLD, 14));
		LB_NAME.setBounds(49, 108, 51, 17);
		mainPane.add(LB_NAME);
		
		field_NameFamily = new JTextField();
		field_NameFamily.setColumns(10);
		field_NameFamily.setBounds(106, 108, 245, 19);
		mainPane.add(field_NameFamily);
		
		field_NameFirst = new JTextField();
		field_NameFirst.setColumns(10);
		field_NameFirst.setBounds(367, 108, 245, 19);
		mainPane.add(field_NameFirst);
		
		field_NameMiddle = new JTextField();
		field_NameMiddle.setColumns(10);
		field_NameMiddle.setBounds(628, 108, 245, 19);
		mainPane.add(field_NameMiddle);
		
		JLabel LB_FAMILY = new JLabel("[FAMILY]");
		LB_FAMILY.setHorizontalAlignment(SwingConstants.CENTER);
		LB_FAMILY.setFont(new Font("Dialog", Font.BOLD, 10));
		LB_FAMILY.setBounds(106, 125, 245, 17);
		mainPane.add(LB_FAMILY);
		
		JLabel LB_FIRSTNAME = new JLabel("[FIRST NAME]");
		LB_FIRSTNAME.setHorizontalAlignment(SwingConstants.CENTER);
		LB_FIRSTNAME.setFont(new Font("Dialog", Font.BOLD, 10));
		LB_FIRSTNAME.setBounds(365, 125, 245, 17);
		mainPane.add(LB_FIRSTNAME);
		
		JLabel LB_LASTNAME = new JLabel("[LAST NAME]");
		LB_LASTNAME.setHorizontalAlignment(SwingConstants.CENTER);
		LB_LASTNAME.setFont(new Font("Dialog", Font.BOLD, 10));
		LB_LASTNAME.setBounds(628, 125, 245, 17);
		mainPane.add(LB_LASTNAME);
		
		JLabel LB_LRN_NUMBER = new JLabel("LRN NO.");
		LB_LRN_NUMBER.setFont(new Font("Dialog", Font.BOLD, 14));
		LB_LRN_NUMBER.setBounds(629, 80, 63, 17);
		mainPane.add(LB_LRN_NUMBER);
		
		JLabel LB_PERSONAL = new JLabel("Personal Information");
		LB_PERSONAL.setFont(new Font("Dialog", Font.BOLD, 20));
		LB_PERSONAL.setBounds(12, 171, 241, 24);
		mainPane.add(LB_PERSONAL);
		
		JPanel PANE_PERSONALINFO = new JPanel();
		PANE_PERSONALINFO.setBounds(12, 199, 1158, 180);
		mainPane.add(PANE_PERSONALINFO);
		PANE_PERSONALINFO.setLayout(null);
		
		JLabel LB_GENDER = new JLabel("Gender:");
		LB_GENDER.setFont(new Font("Dialog", Font.BOLD, 14));
		LB_GENDER.setBounds(12, 12, 70, 15);
		PANE_PERSONALINFO.add(LB_GENDER);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(86, 7, 132, 24);
		PANE_PERSONALINFO.add(comboBox);
		
		txtExampleexamplecom = new JTextField();
		txtExampleexamplecom.setToolTipText("example@example.com");
		txtExampleexamplecom.setColumns(10);
		txtExampleexamplecom.setBounds(71, 68, 245, 19);
		PANE_PERSONALINFO.add(txtExampleexamplecom);
		
		JLabel LB_EMAIL = new JLabel("E-mail:");
		LB_EMAIL.setFont(new Font("Dialog", Font.BOLD, 14));
		LB_EMAIL.setBounds(12, 68, 70, 15);
		PANE_PERSONALINFO.add(LB_EMAIL);
		
		JLabel LB_GENDER_2 = new JLabel("Home Address:");
		LB_GENDER_2.setFont(new Font("Dialog", Font.BOLD, 14));
		LB_GENDER_2.setBounds(12, 95, 122, 17);
		PANE_PERSONALINFO.add(LB_GENDER_2);
		
		JLabel LB_GENDER_3 = new JLabel("Pernament Address:");
		LB_GENDER_3.setFont(new Font("Dialog", Font.BOLD, 14));
		LB_GENDER_3.setBounds(12, 122, 163, 17);
		PANE_PERSONALINFO.add(LB_GENDER_3);
		
		JLabel LB_BIRTHDATE = new JLabel("Birth Date:");
		LB_BIRTHDATE.setFont(new Font("Dialog", Font.BOLD, 14));
		LB_BIRTHDATE.setBounds(12, 38, 84, 17);
		PANE_PERSONALINFO.add(LB_BIRTHDATE);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(184, 95, 122, 19);
		PANE_PERSONALINFO.add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(331, 95, 233, 19);
		PANE_PERSONALINFO.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(605, 95, 233, 19);
		PANE_PERSONALINFO.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(876, 95, 233, 19);
		PANE_PERSONALINFO.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(96, 38, 122, 19);
		PANE_PERSONALINFO.add(textField_6);
		
		LB_PIRTHPLACE = new JTextField();
		LB_PIRTHPLACE.setColumns(10);
		LB_PIRTHPLACE.setBounds(321, 38, 216, 19);
		PANE_PERSONALINFO.add(LB_PIRTHPLACE);
		
		JLabel LB_BIRTHPLACE = new JLabel("Birthplace:");
		LB_BIRTHPLACE.setFont(new Font("Dialog", Font.BOLD, 14));
		LB_BIRTHPLACE.setBounds(230, 38, 85, 17);
		PANE_PERSONALINFO.add(LB_BIRTHPLACE);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(681, 38, 240, 19);
		PANE_PERSONALINFO.add(textField_8);
		
		JLabel LB_MOTHERTONGUE = new JLabel("Mother Tongue:");
		LB_MOTHERTONGUE.setFont(new Font("Dialog", Font.BOLD, 14));
		LB_MOTHERTONGUE.setBounds(553, 38, 127, 17);
		PANE_PERSONALINFO.add(LB_MOTHERTONGUE);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(1039, 38, 107, 19);
		PANE_PERSONALINFO.add(textField_9);
		
		JLabel LB_ETHNIC = new JLabel("Ethnic Group:");
		LB_ETHNIC.setFont(new Font("Dialog", Font.BOLD, 14));
		LB_ETHNIC.setBounds(930, 38, 108, 17);
		PANE_PERSONALINFO.add(LB_ETHNIC);
		
		JLabel LB_MOBILEPHONE = new JLabel("Phone Number:");
		LB_MOBILEPHONE.setFont(new Font("Dialog", Font.BOLD, 14));
		LB_MOBILEPHONE.setBounds(775, 68, 123, 17);
		PANE_PERSONALINFO.add(LB_MOBILEPHONE);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(901, 68, 245, 19);
		PANE_PERSONALINFO.add(textField_11);
		
		JLabel LB_LANDLINE = new JLabel("Landline No:");
		LB_LANDLINE.setFont(new Font("Dialog", Font.BOLD, 14));
		LB_LANDLINE.setBounds(375, 68, 98, 17);
		PANE_PERSONALINFO.add(LB_LANDLINE);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(479, 68, 245, 19);
		PANE_PERSONALINFO.add(textField_7);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(876, 120, 233, 19);
		PANE_PERSONALINFO.add(textField);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(605, 120, 233, 19);
		PANE_PERSONALINFO.add(textField_10);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(331, 120, 233, 19);
		PANE_PERSONALINFO.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(184, 120, 122, 19);
		PANE_PERSONALINFO.add(textField_13);
		
		JLabel LB_ST = new JLabel("Street No.");
		LB_ST.setHorizontalAlignment(SwingConstants.CENTER);
		LB_ST.setFont(new Font("Dialog", Font.BOLD, 10));
		LB_ST.setBounds(187, 138, 119, 17);
		PANE_PERSONALINFO.add(LB_ST);
		
		JLabel LB_BARANGAY = new JLabel("Barangay");
		LB_BARANGAY.setHorizontalAlignment(SwingConstants.CENTER);
		LB_BARANGAY.setFont(new Font("Dialog", Font.BOLD, 10));
		LB_BARANGAY.setBounds(331, 138, 233, 17);
		PANE_PERSONALINFO.add(LB_BARANGAY);
		
		JLabel LB_MCITY = new JLabel("Municipality/City");
		LB_MCITY.setHorizontalAlignment(SwingConstants.CENTER);
		LB_MCITY.setFont(new Font("Dialog", Font.BOLD, 10));
		LB_MCITY.setBounds(605, 138, 233, 17);
		PANE_PERSONALINFO.add(LB_MCITY);
		
		JLabel LB_PROVINCE = new JLabel("Province");
		LB_PROVINCE.setHorizontalAlignment(SwingConstants.CENTER);
		LB_PROVINCE.setFont(new Font("Dialog", Font.BOLD, 10));
		LB_PROVINCE.setBounds(876, 138, 233, 17);
		PANE_PERSONALINFO.add(LB_PROVINCE);
		
		JLabel LB_FAMILY_BG = new JLabel("Family Background");
		LB_FAMILY_BG.setFont(new Font("Dialog", Font.BOLD, 20));
		LB_FAMILY_BG.setBounds(12, 396, 241, 24);
		mainPane.add(LB_FAMILY_BG);
		
		JPanel PANE_FAMILY_BG = new JPanel();
		PANE_FAMILY_BG.setLayout(null);
		PANE_FAMILY_BG.setBounds(14, 432, 1158, 180);
		mainPane.add(PANE_FAMILY_BG);
		
		JLabel lblNewLabel = new JLabel("Name of Father:");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel.setBounds(12, 12, 127, 17);
		PANE_FAMILY_BG.add(lblNewLabel);
		
		textField_14 = new JTextField();
		textField_14.setBounds(168, 11, 250, 19);
		PANE_FAMILY_BG.add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Dialog", Font.BOLD, 14));
		lblAddress.setBounds(12, 41, 72, 17);
		PANE_FAMILY_BG.add(lblAddress);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(168, 39, 250, 19);
		PANE_FAMILY_BG.add(textField_15);
		
		JLabel lblNameOfMother = new JLabel("Name of Mother:");
		lblNameOfMother.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNameOfMother.setBounds(12, 70, 132, 17);
		PANE_FAMILY_BG.add(lblNameOfMother);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(168, 69, 250, 19);
		PANE_FAMILY_BG.add(textField_16);
		
		JLabel lblNameOfGuardian = new JLabel("Name of Guardian:");
		lblNameOfGuardian.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNameOfGuardian.setBounds(12, 121, 147, 17);
		PANE_FAMILY_BG.add(lblNameOfGuardian);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(168, 120, 250, 19);
		PANE_FAMILY_BG.add(textField_17);
		
		JLabel lblNewLabel_4 = new JLabel("Address:");
		lblNewLabel_4.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_4.setBounds(12, 151, 72, 17);
		PANE_FAMILY_BG.add(lblNewLabel_4);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(90, 149, 250, 19);
		PANE_FAMILY_BG.add(textField_18);
		
		JLabel lblOccupation = new JLabel("Occupation:");
		lblOccupation.setFont(new Font("Dialog", Font.BOLD, 14));
		lblOccupation.setBounds(533, 11, 127, 17);
		PANE_FAMILY_BG.add(lblOccupation);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(689, 10, 250, 19);
		PANE_FAMILY_BG.add(textField_19);
		
		JLabel lblNewLabel_1_1 = new JLabel("Contact Number:");
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(533, 39, 134, 17);
		PANE_FAMILY_BG.add(lblNewLabel_1_1);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(689, 39, 250, 19);
		PANE_FAMILY_BG.add(textField_20);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Occapation:");
		lblNewLabel_1_1_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_1_1_1.setBounds(533, 120, 134, 17);
		PANE_FAMILY_BG.add(lblNewLabel_1_1_1);
		
		JLabel lblOccupation_1 = new JLabel("Occupation:");
		lblOccupation_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblOccupation_1.setBounds(533, 69, 127, 17);
		PANE_FAMILY_BG.add(lblOccupation_1);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(689, 69, 250, 19);
		PANE_FAMILY_BG.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(689, 120, 250, 19);
		PANE_FAMILY_BG.add(textField_22);
		
		JLabel lblNewLabel_4_1 = new JLabel("Relationship:");
		lblNewLabel_4_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_4_1.setBounds(371, 149, 102, 17);
		PANE_FAMILY_BG.add(lblNewLabel_4_1);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(477, 149, 250, 19);
		PANE_FAMILY_BG.add(textField_23);
		
		JLabel lblNewLabel_4_2 = new JLabel("Contact No:");
		lblNewLabel_4_2.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_4_2.setBounds(739, 149, 93, 17);
		PANE_FAMILY_BG.add(lblNewLabel_4_2);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(842, 149, 250, 19);
		PANE_FAMILY_BG.add(textField_24);
		
		JLabel lblAddress_1 = new JLabel("Address:");
		lblAddress_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblAddress_1.setBounds(12, 95, 72, 17);
		PANE_FAMILY_BG.add(lblAddress_1);
		
		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBounds(168, 95, 250, 19);
		PANE_FAMILY_BG.add(textField_38);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Contact Number:");
		lblNewLabel_1_1_2.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_1_1_2.setBounds(533, 95, 134, 17);
		PANE_FAMILY_BG.add(lblNewLabel_1_1_2);
		
		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(689, 95, 250, 19);
		PANE_FAMILY_BG.add(textField_39);
		
		JLabel LB_EDU_BG = new JLabel("Educational Bacground");
		LB_EDU_BG.setFont(new Font("Dialog", Font.BOLD, 20));
		LB_EDU_BG.setBounds(14, 624, 262, 24);
		mainPane.add(LB_EDU_BG);
		
		JPanel PANE_EDU_BG = new JPanel();
		PANE_EDU_BG.setLayout(null);
		PANE_EDU_BG.setBounds(14, 655, 1158, 180);
		mainPane.add(PANE_EDU_BG);
		
		JLabel lblElementary = new JLabel("Elementary:");
		lblElementary.setFont(new Font("Dialog", Font.BOLD, 14));
		lblElementary.setBounds(12, 12, 127, 17);
		PANE_EDU_BG.add(lblElementary);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(284, 11, 250, 19);
		PANE_EDU_BG.add(textField_25);
		
		JLabel lblJuniorHighschool = new JLabel("Junior High School:");
		lblJuniorHighschool.setFont(new Font("Dialog", Font.BOLD, 14));
		lblJuniorHighschool.setBounds(12, 41, 149, 17);
		PANE_EDU_BG.add(lblJuniorHighschool);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(284, 39, 250, 19);
		PANE_EDU_BG.add(textField_26);
		
		JLabel lblHighSchoolClassification = new JLabel("high School Classification:");
		lblHighSchoolClassification.setFont(new Font("Dialog", Font.BOLD, 14));
		lblHighSchoolClassification.setBounds(12, 70, 207, 17);
		PANE_EDU_BG.add(lblHighSchoolClassification);
		
		JLabel lblSeniorHighSchool = new JLabel("Senior High School (if transferee)");
		lblSeniorHighSchool.setFont(new Font("Dialog", Font.BOLD, 14));
		lblSeniorHighSchool.setBounds(12, 99, 265, 17);
		PANE_EDU_BG.add(lblSeniorHighSchool);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(284, 100, 250, 19);
		PANE_EDU_BG.add(textField_28);
		
		JLabel lblNewLabel_4_3 = new JLabel("TOTAL ACCESSED FEE:");
		lblNewLabel_4_3.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_4_3.setBounds(12, 151, 177, 17);
		PANE_EDU_BG.add(lblNewLabel_4_3);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(190, 149, 54, 19);
		PANE_EDU_BG.add(textField_29);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("INITIAL PAYMENT:");
		lblNewLabel_4_1_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_4_1_1.setBounds(255, 151, 138, 17);
		PANE_EDU_BG.add(lblNewLabel_4_1_1);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(394, 150, 54, 19);
		PANE_EDU_BG.add(textField_34);
		
		JLabel lblNewLabel_4_2_1 = new JLabel("O.R NO:");
		lblNewLabel_4_2_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_4_2_1.setBounds(460, 151, 93, 17);
		PANE_EDU_BG.add(lblNewLabel_4_2_1);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(526, 150, 54, 19);
		PANE_EDU_BG.add(textField_35);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(546, 12, 250, 19);
		PANE_EDU_BG.add(textField_27);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(546, 40, 250, 19);
		PANE_EDU_BG.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(674, 98, 122, 19);
		PANE_EDU_BG.add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(896, 12, 250, 19);
		PANE_EDU_BG.add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(896, 40, 250, 19);
		PANE_EDU_BG.add(textField_33);
		
		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(896, 101, 250, 19);
		PANE_EDU_BG.add(textField_36);
		
		JLabel lblYear = new JLabel("Year:");
		lblYear.setFont(new Font("Dialog", Font.BOLD, 14));
		lblYear.setBounds(842, 12, 42, 17);
		PANE_EDU_BG.add(lblYear);
		
		JLabel lblYear_1 = new JLabel("Year:");
		lblYear_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblYear_1.setBounds(842, 42, 42, 17);
		PANE_EDU_BG.add(lblYear_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(284, 66, 250, 24);
		PANE_EDU_BG.add(comboBox_1);
		
		JLabel lblYear_1_1 = new JLabel("Grade:");
		lblYear_1_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblYear_1_1.setBounds(618, 99, 54, 17);
		PANE_EDU_BG.add(lblYear_1_1);
		
		JLabel lblYear_1_1_1 = new JLabel("Sem/Year:");
		lblYear_1_1_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblYear_1_1_1.setBounds(814, 99, 81, 17);
		PANE_EDU_BG.add(lblYear_1_1_1);
		
		JLabel lblNewLabel_4_2_1_1 = new JLabel("Date:");
		lblNewLabel_4_2_1_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_4_2_1_1.setBounds(598, 151, 42, 17);
		PANE_EDU_BG.add(lblNewLabel_4_2_1_1);
		
		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(644, 150, 54, 19);
		PANE_EDU_BG.add(textField_37);

	}
}
