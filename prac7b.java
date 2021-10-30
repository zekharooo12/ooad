import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;
public class prac7b {
    public prac7b() {
        JFrame frame = new JFrame();
// CSE MBA
        DefaultMutableTreeNode top = new DefaultMutableTreeNode("CSE-MBA");
// Trimester-1
        DefaultMutableTreeNode t1 = new DefaultMutableTreeNode("Trimester-1");
        top.add(t1);
// Trimester-1 Subjects
        DefaultMutableTreeNode linearAlgebra = new
                DefaultMutableTreeNode("Linear Algebra");
        t1.add(linearAlgebra);
        DefaultMutableTreeNode unit1 = new DefaultMutableTreeNode("Unit 1 : Matrix Theory");
        linearAlgebra.add(unit1);
        DefaultMutableTreeNode unit2 = new DefaultMutableTreeNode("Unit 2 : Vector & Linear Transformation");
        linearAlgebra.add(unit2);
        DefaultMutableTreeNode physics = new
                DefaultMutableTreeNode("Physics");
        t1.add(physics);
        DefaultMutableTreeNode p1 = new DefaultMutableTreeNode("Unit 1 : Nanomaterials");
        physics.add(p1);
        DefaultMutableTreeNode p2 = new DefaultMutableTreeNode("Unit 2 : Lasers & Holography");
        physics.add(p2);
        DefaultMutableTreeNode fop = new DefaultMutableTreeNode("Fundamentals Of Programming");
        t1.add(fop);
        DefaultMutableTreeNode f1 = new DefaultMutableTreeNode("Unit 1 : Arrays");
        fop.add(f1);
        DefaultMutableTreeNode f2 = new DefaultMutableTreeNode("Unit 2 : Characters and Strings");
        fop.add(f2);
        DefaultMutableTreeNode EEE = new DefaultMutableTreeNode("Elements of Electrical Engineering");
        t1.add(EEE);
        DefaultMutableTreeNode e1 = new DefaultMutableTreeNode("Unit 1 : Single Phase AC Circuits");
        EEE.add(e1);
        DefaultMutableTreeNode e2 = new DefaultMutableTreeNode("Unit 2 : Three Phase AC Circuits");
        EEE.add(e2);
        DefaultMutableTreeNode english1 = new DefaultMutableTreeNode("English1");
        t1.add(english1);
        DefaultMutableTreeNode eng1 = new DefaultMutableTreeNode("Unit 1 : Vocabulary & Grammer");
        english1.add(eng1);
        DefaultMutableTreeNode eng2 = new DefaultMutableTreeNode("Unit 2 : Comprehension");
        english1.add(eng2);
// Trimester-2
        DefaultMutableTreeNode t2 = new DefaultMutableTreeNode("Trimester-2");
        top.add(t2);
// Trimester-2 Subjects
        DefaultMutableTreeNode calculus = new
                DefaultMutableTreeNode("Calculus");
        t2.add(calculus);
        DefaultMutableTreeNode c1 = new DefaultMutableTreeNode("Unit 1 : Integral Calculus");
        calculus.add(c1);
        DefaultMutableTreeNode c2 = new DefaultMutableTreeNode("Unit 2 : Differential Calculus");
        calculus.add(c2);
        DefaultMutableTreeNode EG = new DefaultMutableTreeNode("EngineeringGraphics");
        t2.add(EG);
        DefaultMutableTreeNode eg1 = new DefaultMutableTreeNode("Unit 1 : Engineering Curves");
        EG.add(eg1);
        DefaultMutableTreeNode eg2 = new DefaultMutableTreeNode("Unit 2 : Solid Geometry");
        EG.add(eg2);
        DefaultMutableTreeNode basicElectronics = new
                DefaultMutableTreeNode("Basic Electronics");
        t2.add(basicElectronics);
        DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("Unit 1 : Analog Electronics");
        basicElectronics.add(b1);
        DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("Unit 2 : Digital Electronics");
        basicElectronics.add(b2);
        DefaultMutableTreeNode Sp = new DefaultMutableTreeNode("Structured Programming");
        t2.add(Sp);
        DefaultMutableTreeNode sp1 = new DefaultMutableTreeNode("Unit 1 : Pointers");
        Sp.add(sp1);
        DefaultMutableTreeNode sp2 = new DefaultMutableTreeNode("Unit 2 : File Handling");
        Sp.add(sp2);
        DefaultMutableTreeNode english2 = new DefaultMutableTreeNode("English2");
        t2.add(english2);
        DefaultMutableTreeNode eng2_1 = new DefaultMutableTreeNode("Unit 1:Business Letters");
        english2.add(eng2_1);
        DefaultMutableTreeNode eng2_2 = new DefaultMutableTreeNode("Unit 2 : Essay Writing");
        english2.add(eng2_2);
// Trimester-3
        DefaultMutableTreeNode t3 = new DefaultMutableTreeNode("Trimester-3");
        top.add(t3);
// Trimester-3 Subjects
        DefaultMutableTreeNode Oops = new DefaultMutableTreeNode("Object Oriented Programming");
        t3.add(Oops);
        DefaultMutableTreeNode op1 = new DefaultMutableTreeNode("Unit 1:Inheritances");
        Oops.add(op1);
        DefaultMutableTreeNode op2 = new DefaultMutableTreeNode("Unit 2 : Packages and Interfaces");
        Oops.add(op2);
        DefaultMutableTreeNode differentialEquations = new
                DefaultMutableTreeNode("Differential Equations");
        t3.add(differentialEquations);
        DefaultMutableTreeNode d1 = new DefaultMutableTreeNode("Unit 1 : Ordinary Differential Equations");
        differentialEquations.add(d1);
        DefaultMutableTreeNode d2 = new DefaultMutableTreeNode("Unit 2 : Partial Differential Equations");
        differentialEquations.add(d2);
        DefaultMutableTreeNode digitalElectronics = new
                DefaultMutableTreeNode("Digital Electronics");
        t3.add(digitalElectronics);
        DefaultMutableTreeNode de1 = new DefaultMutableTreeNode("Unit 1 : Combinational Logic");
        digitalElectronics.add(de1);
        DefaultMutableTreeNode de2 = new DefaultMutableTreeNode("Unit 2 : Sequential Logic");
        digitalElectronics.add(de2);
        DefaultMutableTreeNode discreteMaths = new
                DefaultMutableTreeNode("Environmental Studies");
        t3.add(discreteMaths);
        DefaultMutableTreeNode dm1 = new DefaultMutableTreeNode("Unit 1:Relations & Functions");
        discreteMaths.add(dm1);
        DefaultMutableTreeNode dm2 = new DefaultMutableTreeNode("Unit 2 : Proof Techniques");
        discreteMaths.add(dm2);
        DefaultMutableTreeNode evs = new DefaultMutableTreeNode("English-2");
        t3.add(evs);
        DefaultMutableTreeNode evs1 = new DefaultMutableTreeNode("Unit 1:Enviromental Pollution");
        evs.add(evs1);
        DefaultMutableTreeNode evs2 = new DefaultMutableTreeNode("Unit 2 : EWaste Management");
        evs.add(evs2);
// Trimester-4
        DefaultMutableTreeNode t4 = new DefaultMutableTreeNode("Trimester-4");
        top.add(t4);
// Trimester-4 Subjects
        DefaultMutableTreeNode Dsa = new DefaultMutableTreeNode("Data Structures & Algorithms");
        t4.add(Dsa);
        DefaultMutableTreeNode dsa1 = new DefaultMutableTreeNode("Unit 1:Linear Data Structures");
        Dsa.add(dsa1);
        DefaultMutableTreeNode dsa2 = new DefaultMutableTreeNode("Unit 2 : Non - Linear Data Structures");
        Dsa.add(dsa2);
        DefaultMutableTreeNode Ps = new DefaultMutableTreeNode("Probability and Statistics");
        t4.add(Ps);
        DefaultMutableTreeNode ps1 = new DefaultMutableTreeNode("Unit 1 :The Role of Statistics in Engineering");
        Ps.add(ps1);
        DefaultMutableTreeNode ps2 = new DefaultMutableTreeNode("Unit 2 : Probability and Probability Distributions");
        Ps.add(ps2);
        DefaultMutableTreeNode Ooad = new DefaultMutableTreeNode("Object Oriented Application Development");
        t4.add(Ooad);
        DefaultMutableTreeNode ooad1 = new DefaultMutableTreeNode("Unit 1:Multithreaded Programming");
        Ooad.add(ooad1);
        DefaultMutableTreeNode ooad2 = new DefaultMutableTreeNode("Unit 2 : Introduction to Swing");
        Ooad.add(ooad2);
        DefaultMutableTreeNode ooad3 = new DefaultMutableTreeNode("Unit 2 : Event Handling");
        Ooad.add(ooad3);
        DefaultMutableTreeNode Pom = new DefaultMutableTreeNode("Principles of Management");
        t4.add(Pom);
        DefaultMutableTreeNode pom1 = new DefaultMutableTreeNode("Unit 1:Nature of Management");
        Pom.add(pom1);
        DefaultMutableTreeNode pom2 = new DefaultMutableTreeNode("Unit 2 : Directing, Co-ordination and Controlling");
        Pom.add(pom2);
        DefaultMutableTreeNode Pds = new DefaultMutableTreeNode("Programming with Data Structures");
        t4.add(Pds);
        DefaultMutableTreeNode pds1 = new DefaultMutableTreeNode("LAB WORK OF DATA STRUCTURES");
        Pds.add(pds1);
        DefaultMutableTreeNode Osl = new DefaultMutableTreeNode("Open Source Laboratory");
        t4.add(Osl);
        DefaultMutableTreeNode osl1 = new DefaultMutableTreeNode("Unit 1 :Open CV");
        Osl.add(osl1);
        DefaultMutableTreeNode osl2 = new DefaultMutableTreeNode("Unit 2 : Pearl & MySQL");
        Osl.add(osl2);
        JTree tree = new JTree(top);
        JLabel display_path = new JLabel();
        display_path.setBounds(20, 700, 680, 25);
        frame.add(display_path);
        tree.addTreeSelectionListener(new TreeSelectionListener() {
            public void valueChanged(TreeSelectionEvent tse) {
                display_path.setText("Selection is : " + tse.getPath());
            }
        });
        frame.add(tree);
        frame.setVisible(true);
        frame.setSize(800, 800);
        frame.setResizable(false);
        frame.setTitle("CSE-MBA COURSE POLICY");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new prac7b();
    }
}
