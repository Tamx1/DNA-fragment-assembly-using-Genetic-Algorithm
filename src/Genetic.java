import java.io.File;
import java.util.*;
import javax.swing.*;


public class Genetic extends javax.swing.JFrame {
    
    

        public static int Stop_condition;    
        public static int Crossover ;
        public static int Mutation ;
        public static String DataSets ;

        
        
public Genetic() {
        initComponents();
    }
    @SuppressWarnings("unchecked")

    
    
    private void initComponents() {

         setTitle("DNA Fragment Assembly - GA");
         
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Select)", "Random", "SCX", "OX2", "ER", "PMX", "CX", "PX" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Select)", "Random", "Displacement", "Inversion", "Swap", "Scramble", "Combined" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        
        
        

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Select)", "AF153612", "BD393986", "BX747047", "D11343", "GU354832", "JQ414563", "KM424533", "KM424592", "X60189", "KX025132" }));

        jButton1.setText("Run");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        
        
        

        jLabel1.setText("Crossover");

        jLabel2.setText("Mutation");

        jLabel3.setText("Data Sets");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Select)", "Stop condition 1", "Stop condition 2" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        
        
        jLabel4.setText("Stop condition");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("===================== Output =====================");
        jScrollPane1.setViewportView(jTextArea1);
        
        
        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox3, 0, 102, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        
        
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
    }
    
    
    
    

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        
        
         
        if(jComboBox1.getSelectedIndex()==0){JOptionPane.showMessageDialog(this, "Select Crossover !");return;}
            
            if(jComboBox2.getSelectedIndex()==0){JOptionPane.showMessageDialog(this, "Select Mutation !");return;}
            
            if(jComboBox3.getSelectedIndex()==0){JOptionPane.showMessageDialog(this, "Select Data sets !");return;}
            
            if(jComboBox4.getSelectedIndex()==0){JOptionPane.showMessageDialog(this, "Select Stop condition !");return;}
            
            Crossover=jComboBox1.getSelectedIndex();
            Mutation=jComboBox2.getSelectedIndex();
            DataSets=(String)jComboBox3.getSelectedItem();
            Stop_condition=jComboBox4.getSelectedIndex();
            
            
            try {
                GeneticAlgorithm();
            } catch (Exception ex) {System.out.print("Error\n");}


    }

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {}
    
    

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {}
    
    
    
    
    public static void main(String args[]) {
       
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Genetic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Genetic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Genetic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Genetic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Genetic().setVisible(true);
            }
        });
    }

    
    
    
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextArea jTextArea1;
  


    



   public static void Stop_condition_1()throws Exception{

        Population population;

        System.out.println("------------------------------------------------------------------------------");
        ArrayList<Integer> data = new ArrayList<>();
        ArrayList<Double> time = new ArrayList<>();
        
        
            
            
           double s1= System.nanoTime();
            population = new Population();

            while (checkPopulation(population)) {
                
                
                population.Crossover();
                
                
                for (int j = 0; j < population.population.length; j++) {
                    System.out.println(population.population[j]);
                }
                System.out.println("------------------------------------------------------------------------------");
            }

            
            if (hasDuplicate(population.population[0])) {
                System.out.println("Dup");
            }

            
            String final_sequence = "";
            final_sequence = final_sequence + population.population[0].get(0);
            
            for (int i = 1; i < population.population[0].size(); i++) {
                
                
                if (final_sequence.length() <= population.population[0].get(i).length()) {
                    
                    
                    for (int j = 0, k = final_sequence.length(); i < final_sequence.length(); j++, k--) {
                        
                        if (final_sequence.substring(j).equals(population.population[0].get(i).substring(0, k))) {
                            
                            
                            final_sequence = final_sequence + population.population[0].get(i).substring(k);
                            break;
                        }

                    }
                } 
                else {
                    for (int j = final_sequence.length() - population.population[0].get(i).length(), k = population.population[0].get(i).length(); k > -1; j++, k--) {
                        
                        
                        if (final_sequence.substring(j).equals(population.population[0].get(i).substring(0, k))) {
                            
                            final_sequence = final_sequence + population.population[0].get(i).substring(k);
                            break;
                        }
                    }
                }

            }
            System.out.println("");System.out.println("");
            System.out.print("Final sequence: ");System.out.println(final_sequence);
            long e=System.nanoTime();
            double total = ((e-s1)/1e+9);
            time.add(total);
            data.add(final_sequence.length());
       System.out.print("Final sequence length: "); System.out.println(data);
       System.out.print("Time: "); System.out.println(time+"s");
       
       jTextArea1.append("\nFinal sequence: "+final_sequence
                         +"\nFinal sequence length: "+data
                         +"\nTime: "+time
                         +"s\n\n================================");
       
    }
   
   
   
   
   public static void Stop_condition_2()throws Exception{

        Population population;

        System.out.println("------------------------------------------------------------------------------");
        
        
        ArrayList<Integer> data = new ArrayList<>();
        ArrayList<Double> time = new ArrayList<>();
        
        
            
            
            double s1= System.nanoTime();
            population = new Population();
            
           int x=0,score=-1;
           ArrayList<String> stor = new ArrayList<>();
            while (x<100) {
                
                
                population.Crossover();
                
                
                for (int j = 0; j < population.population.length; j++) {
                    System.out.println(population.population[j]);
                }
                System.out.println("------------------------------------------------------------------------------");
                
                
                int e=eval(population);
                int scor2=population.eval(population.population[e]);
                
           if(scor2>score){
           score=scor2;
           stor.clear();
           stor.addAll(population.population[e]);
           x=0;
           }
           else{x++;}
            
                System.out.println(x);  }
            
            
            population.population[0].clear();population.population[0].addAll(stor);
            if (hasDuplicate(population.population[0])) {
                System.out.println("Dup");
            }

            
            
            String final_sequence = "";
            final_sequence = final_sequence + population.population[0].get(0);
            for (int i = 1; i < population.population[0].size(); i++) {
                
                
                if (final_sequence.length() <= population.population[0].get(i).length()) {
                    
                    
                    for (int j = 0, k = final_sequence.length(); i < final_sequence.length(); j++, k--) {
                        
                        
                        if (final_sequence.substring(j).equals(population.population[0].get(i).substring(0, k))) {
                            
                            final_sequence = final_sequence + population.population[0].get(i).substring(k);
                            break;
                        }

                    }
                } 
                else {
                    for (int j = final_sequence.length() - population.population[0].get(i).length(), k = population.population[0].get(i).length(); k > -1; j++, k--) {
                        
                        
                        if (final_sequence.substring(j).equals(population.population[0].get(i).substring(0, k))) {
                            
                            final_sequence = final_sequence + population.population[0].get(i).substring(k);
                            break;
                        }
                    }
                }

            }

            System.out.println("");System.out.println("");
            System.out.print("Final sequence: ");System.out.println(final_sequence);
            
            long e=System.nanoTime();
            double total = ((e-s1)/1e+9);
            time.add(total);
            data.add(final_sequence.length());
       System.out.print("Final sequence length: "); System.out.println(data);
       System.out.print("Time: "); System.out.println(time+"s");
              jTextArea1.append("\nFinal sequence: "+final_sequence
                         +"\nFinal sequence length: "+data
                         +"\nTime: "+time
                         +"s\n\n================================");
    
   
   }
    
    
   
   
   
   
    public static void GeneticAlgorithm() throws Exception {

        if(Stop_condition==1){Stop_condition_1();}else{Stop_condition_2();}
        
        
    }

    
    
    
    public static boolean checkPopulation(Population population) {
        for (int i = 0; i < population.population.length - 1; i++) {
            if (!population.population[i].equals(population.population[i + 1])) {
                return true;
            }
        }
        return false;
    }

    
    
    
    public static int eval(Population population) {
      int s=-1; int temp=-1;
      for(int i=0;i<population.population.length;i++){
      int temp2=population.eval(population.population[i]);
      if(temp2>temp){s=i;temp=temp2;}}

    return s;}
    
    
    
    
    public static boolean hasDuplicate(ArrayList<String> individual) {
        Set<String> set = new HashSet<String>(individual);

        return set.size() < individual.size();
    }

   
    
    
    
    
public static class Population {
    
    
    public int population_count = 10;
    public ArrayList<String>[] population = new ArrayList[population_count];
    public int no_of_fragments;
    public ArrayList<String> original = new ArrayList<>();

    
    

    public Population() throws Exception  {
        try {

        File file = new File("src\\"+DataSets+".txt");
        Scanner scanner = new Scanner(file);
        ArrayList<String> individual = new ArrayList<>();
        String c="";
        while (scanner.hasNext()) {
           String b=scanner.next();
           c=c+b;
            individual.add(b);
            
        }
          
        
       jTextArea1.append("\n\nSequence length: "+c.length());

        //removing duplicates
        Set<String> set = new HashSet<>(individual);
        individual.clear();
        individual.addAll(set);
        original.addAll(individual);
        no_of_fragments = individual.size();

        for (int i = 0; i < population.length; i++) {
            population[i] = new ArrayList<>();
            Collections.shuffle(individual);
            population[i].addAll(individual);
        }
    } catch (Exception e) {System.out.println("\nData Set path error\nDefault path: 'src\\"+DataSets+".txt'");
                           jTextArea1.append("\nData Set path error\nDefault path: 'src\\"+DataSets+".txt'");}}
    
    
    
    
 public void ER(){
     
     
     
        int maximum = 0;
        ArrayList<String> temp = new ArrayList<>();
        for (int i = 0; i < population_count - 1; i++) {
        for (int j = i; j < population_count; j++) {
             if (eval(population[j]) > eval(population[maximum]))
                    maximum = j;
            }
            temp.clear();
            temp.addAll(population[maximum]);
            population[maximum].clear();
            population[maximum].addAll(population[i]);
            population[i].clear();
            population[i].addAll(temp);
        }
     
        

        ArrayList<String>[] elite;
        Random R = new Random();
        ArrayList <String> Child= new ArrayList <> (); 
        ArrayList <String> [] population2 = new ArrayList[population_count];
       
        for ( int i = 0 ; i < population2.length ; i++ ) {
            population2[i] = new ArrayList<>();
        }
       
        
        
     int current=0; 
     while (current < population_count) {
            
          elite=select();
          ArrayList<String> []NeighborList = new ArrayList[elite[0].size()];
          
          
          for ( int i = 0 ; i < elite[0].size() ; i++ ) {
            
            NeighborList[i] = new ArrayList<>();
            NeighborList[i].clear(); }   
            
   
    for(int i=0;i<elite[0].size();i++){
    
     int index1=i+1;
     int index2=i-1;
     if(index1==elite[0].size()){index1=0;}
     if(index2==-1){index2=elite[0].size()-1;}
      
     
     NeighborList[i].add(elite[0].get(i));
     NeighborList[i].add(elite[0].get(index1));
     NeighborList[i].add(elite[0].get(index2)); }
    
   
    for(int i=0;i<elite[1].size();i++){
     
     int Point=elite[1].indexOf(elite[0].get(i));
     int index1=Point+1;
     int index2=Point-1;
     if(index1==elite[1].size()){index1=0;}
     if(index2==-1){index2=elite[1].size()-1;}
     
     
         if(NeighborList[i].contains(elite[1].get(index1))==false){NeighborList[i].add(elite[1].get(index1));}   
 
         if(NeighborList[i].contains(elite[1].get(index2))==false){NeighborList[i].add(elite[1].get(index2));}
    }
     
    
   
    int SelectFirst=R.nextInt(2);
    String First=elite[SelectFirst].get(0);
   
    while(Child.size()!=elite[0].size()){
  
        Child.add(First);
        String c="";
 
      
      for(int x=0;x<elite[0].size();x++){
          if(NeighborList[x].contains(First)){
              if(NeighborList[x].indexOf(First)!=0){NeighborList[x].remove(First);}  }   
      }
      
      
  
 for(int x=0;x<elite[0].size();x++){
     
     if(NeighborList[x].get(0)==First){

         boolean contains=true;
         if(NeighborList[x].size()==1){ 
             
             while(contains){
            
                 c=elite[0].get(R.nextInt(elite[0].size()));
                 
                 if(!Child.contains(c)){
                     contains=false;}
          
             } }
             
         
             else{
             
               int min=5; 
               for(int n=1; n<NeighborList[x].size(); n++){
                  String S2= NeighborList[x].get(n);
                  
                 
               for(int w=0;w<elite[0].size();w++){
               if(NeighborList[w].get(0).equals(S2)){
                  
                   if(NeighborList[w].size()<=min ){
                   
                       
                   if(NeighborList[w].size()==min){
                       boolean l=R.nextBoolean();
                       if(l){
                             c=S2;
                             min=NeighborList[w].size();}}
                   
                   
                         if(NeighborList[w].size()<min){
                          c=S2;
                          min=NeighborList[w].size();}}}}}
         }  
     } 
 }  
 
 
      First=c;  
      if(Child.size()+1==elite[0].size()){Child.add(First);}}
         
    
     if(Math.random() < 0.05)
        mutate(Child);
     
      population2[current].addAll(Child);
      current++;
        
       Child.clear();
     }
            
       
     
        for (int i = 0; i < population_count; i++) {
            population[i].clear();
            population[i].addAll(population2[i]);
        }
    }
 
 
 
 
 
    public void ox2() {
        
        
        //sorting: start
        int maximum = 0;
        ArrayList<String> temp = new ArrayList<>();
        for (int i = 0; i < population_count - 1; i++) {
            for (int j = i; j < population_count; j++) {
                if (eval(population[j]) > eval(population[maximum]))
                    maximum = j;
            }
            temp.clear();
            temp.addAll(population[maximum]);
            population[maximum].clear();
            population[maximum].addAll(population[i]);
            population[i].clear();
            population[i].addAll(temp);
        }
        //sorting: end
        
        
        Random random = new Random();
        ArrayList<Integer> positions = new ArrayList<>();
        int position;
        int num_of_positions = (int)Math.ceil(no_of_fragments/2);
        ArrayList<String> child = new ArrayList<>();
        ArrayList<String>[] population2 = new ArrayList[population_count];
        for (int i = 0; i < population2.length; i++) {
            population2[i] = new ArrayList<>();
        }
        
        
        int current_individuals = 0;
        ArrayList<String> fragments = new ArrayList<>();
        ArrayList<String>[] elite;

        
        
        while (current_individuals < population_count) {
            for (int j = 0; j < num_of_positions; j++) {
                position = random.nextInt(no_of_fragments);
                if (positions.contains(position)) {
                    j--;
                    continue;
                }
                positions.add(position);
            }

            
            
            Collections.sort(positions);

            elite = select();

            for (int j = 0; j < positions.size(); j++) {
                fragments.add(elite[0].get(positions.get(j)));
            }

            
            
            int i = 0;
            int order = 0;
            while (i < no_of_fragments) {
                if (fragments.contains(elite[1].get(i))) {
                    child.add(fragments.get(order));
                    order++;
                } else {
                    child.add(elite[1].get(i));
                }
                i++;
            }

            
            
            if (Math.random() < 0.05)
                mutate(child);

            
            
            population2[current_individuals].addAll(child);

            child.clear();
            i = 0;
            order = 0;
            fragments.clear();
            current_individuals++;

            for (int j = 0; j < positions.size(); j++) {
                fragments.add(elite[1].get(positions.get(j)));
            }

            
            while (i < no_of_fragments) {
                if (fragments.contains(elite[0].get(i))) {
                    child.add(fragments.get(order));
                    order++;
                } else {
                    child.add(elite[0].get(i));
                }
                i++;

            }

            
            if (Math.random() < 0.05)
                mutate(child);

            population2[current_individuals].addAll(child);

            child.clear();
            positions.clear();
            fragments.clear();
            current_individuals++;
        }
        for (int i = 0; i < population_count; i++) {
            population[i].clear();
            population[i].addAll(population2[i]);
        }
    }

    
    
    
    
    public void scx() {
        
        
        //sorting: start
        int maximum = 0;
        ArrayList<String> temp = new ArrayList<>();
        for (int i = 0; i < population_count - 1; i++) {
            for (int j = i; j < population_count; j++) {
                if (eval(population[j]) > eval(population[maximum]))
                    maximum = j;
            }
            temp.clear();
            temp.addAll(population[maximum]);
            population[maximum].clear();
            population[maximum].addAll(population[i]);
            population[i].clear();
            population[i].addAll(temp);
        }
        //sorting: end

        ArrayList<String>[] population2 = new ArrayList[population_count];
        for (int i = 0; i < population2.length; i++) {
            population2[i] = new ArrayList<>();
        }
        
        
        ArrayList<String> child = new ArrayList<>();

        String p1_legitimate = "empty", p2_legitimate = "empty";
        ArrayList<String>[] elite;
        for (int current_individual = 0; current_individual < population_count; current_individual++) {
            elite = select();
            child.add(original.get(0));
            while (child.size() < no_of_fragments) {
                for (int i = elite[0].indexOf(child.get(child.size() - 1)) + 1; i < elite[0].size(); i++) {
                    if (!child.contains(elite[0].get(i))) {
                        p1_legitimate = elite[0].get(i);
                        break;
                    }
                }

                
                
                if (p1_legitimate.equals("empty")) {
                    for (int j = 0; j < original.size(); j++) {
                        if (!child.contains(original.get(j))) {
                            p1_legitimate = original.get(j);
                        }
                    }
                }

                
                
                for (int i = elite[1].indexOf(child.get(child.size() - 1)) + 1; i < elite[1].size(); i++) {
                    if (!child.contains(elite[1].get(i))) {
                        p2_legitimate = elite[1].get(i);
                        break;
                    }
                }

                
                
                if (p2_legitimate.equals("empty")) {
                    for (int j = 0; j < original.size(); j++) {
                        if (!child.contains(original.get(j))) {
                            p2_legitimate = original.get(j);
                        }
                    }
                }

                
                if (overlap(child.get(child.size() - 1), p1_legitimate) > overlap(child.get(child.size() - 1), p2_legitimate)) {
                    child.add(p1_legitimate);
                } else {
                    child.add(p2_legitimate);
                }

                
                p1_legitimate = "empty";
                p2_legitimate = "empty";
            }
            
            
            if (Math.random() < 0.05)
                mutate(child);

            
            population2[current_individual].addAll(child);

            child.clear();
        }

        
        for (int i = 0; i < population_count; i++) {
            population[i].clear();
            population[i].addAll(population2[i]);
        }

    }

  
    
    
public void CX() {
     
    
    
        int maximum = 0;
        ArrayList<String> temp = new ArrayList<>();
        for (int i = 0; i < population_count - 1; i++) {
            for (int j = i; j < population_count; j++) {
                if (eval(population[j]) > eval(population[maximum]))
                    maximum = j;
            }
            temp.clear();
            temp.addAll(population[maximum]);
            population[maximum].clear();
            population[maximum].addAll(population[i]);
            population[i].clear();
            population[i].addAll(temp);
        }
        
        
        ArrayList<String>[] elite;
        ArrayList <String> Child1 = new ArrayList <> ();
        ArrayList <String> Child2 = new ArrayList <> ();
        ArrayList <String> [] population2 = new ArrayList[population_count];
        
        
        
        for ( int i = 0 ; i < population2.length ; i++ ) {
            population2[i] = new ArrayList<>();
        }
         
        
         int current=0; 
         while (current < population_count) {
                
        elite=select();
        String [][] child = new String [2][elite[0].size()];
        int x =0;
        do{
            
        child [0][x] = elite[0].get(x);
        child [1][x] = elite[1].get(x);
        x = elite[0].indexOf( elite[1].get(x) ); 
       
        
        } while ( x!=0 );
    
  
        for( int i=0 ; i<2 ; i++ ){
            
        for( int j=0; j<elite[0].size() ; j++ ){   
            
        if( i==0 && child[0][j]==null ) { 
            child[0][j] = elite[1].get(j); }
        if( i==1 && child[1][j]==null ){
            child[1][j]=elite[0].get(j);}
        }
      }   
                 for(int i=0;i<2;i++){
                 for(int j=0;j<elite[0].size();j++){
                 if(i==0){if(!Child1.contains(child[i][j])){Child1.add(child[i][j]);}}
                 if(i==1){if(!Child2.contains(child[i][j])){Child2.add(child[i][j]);}} }}
                 
             
                 
             
        if (Math.random() < 0.05)
                mutate(Child1);
        if (Math.random() < 0.05)
                mutate(Child2);
        
        population2[current].addAll(Child1);
        current++;

        population2[current].addAll(Child2);
        current++;
        
        Child1.clear();
        Child2.clear();
     }
     
         
         
      for (int i = 0; i < population_count; i++) {
            population[i].clear();
            population[i].addAll(population2[i]);
        }
      }




public void mutate(ArrayList<String> child) {

    Random  r =new Random();
    int x;
    if(Mutation==1){x=r.nextInt(6-2+1)+2;}else{x=Mutation;}
    
    switch (x){
    case 2:
        Displacement_mutation(child);
        break;
    case 3:
        Inversion_Mutation(child);
        break;
    case 4:
        Swap_Mutation(child);
        break;
    case 5:
        Scramble_Mutation(child);
        break;
     case 6:
         Combined_Mutation(child);
        break;
        
    }

}
    


  
    public void Swap_Mutation(ArrayList<String> child) {
        Random random = new Random();
        int pos1;
        int pos2;
        do {
            pos1 = random.nextInt(no_of_fragments);
            pos2 = random.nextInt(no_of_fragments);
        } while (pos1 == pos2);

        String temp = child.get(pos1);
        child.set(pos1, child.get(pos2));
        child.set(pos2, temp);
    }


    

    public ArrayList<String>[] select() {
        
        
        int parent1 = -1;
        int parent2 = -1;

        for (int i = 0; i < population_count; i++) {
            if (Math.random() < 0.5 || i == population_count - 1) {
                parent1 = i;
                break;
            }
        }

        
        for (int i = 0; i < population_count; i++) {
            if ((Math.random() < 0.5 && i != parent1) || i == population_count - 1) {
                if (i == population_count - 1) {
                    parent2 = i - 1;
                    break;
                }
                parent2 = i;
                break;
            }
        }

        return new ArrayList[]{population[parent1], population[parent2]};
    }

    
    
    
    
    
    public int eval(ArrayList<String> individual) {
        
        int overlap_score = 0;
        
        for (int i = 0; i < individual.size() - 1; i++) {
            overlap_score = overlap_score + overlap(individual.get(i), individual.get(i + 1));
        }
        
        return overlap_score;
    }

    
    
    
    
    
    public int overlap(String f1, String f2) {

        int score = 0;
        
        if (f1.length() <= f2.length()) {
            for (int i = 0, j = f1.length(); i < f1.length(); i++, j--) {
                if (f1.substring(i).equals(f2.substring(0, j))) {
                    score = f1.substring(i).length();
                }

            }
            
            
        } else {
            for (int i = f1.length() - f2.length(), j = f2.length(); j > -1; i++, j--) {
                if (f1.substring(i).equals(f2.substring(0, j))) {
                    score = f1.substring(i).length();
                }
            }
        }

        return score;
    }
    
    
    
    
    
    public void PMX(){
         
     
        int maximum = 0;
        ArrayList<String> temp = new ArrayList<>();
        for (int i = 0; i < population_count - 1; i++) {
        for (int j = i; j < population_count; j++) {
        if (eval(population[j]) > eval(population[maximum]))
         maximum = j;
            }
            temp.clear();
            temp.addAll(population[maximum]);
            population[maximum].clear();
            population[maximum].addAll(population[i]);
            population[i].clear();
            population[i].addAll(temp);
        }
      
         
         ArrayList<String>[] elite;
         String [] child1 ;
         String [] child2 ;
         ArrayList <String> [] population2 = new ArrayList[population_count];
         for ( int i = 0 ; i < population2.length ; i++ ) {
         population2[i] = new ArrayList<>();
        }
         
         
         Random R = new Random();
         ArrayList <String> Child1 = new ArrayList <> ();
         ArrayList <String> Child2 = new ArrayList <> ();
         int current=0;
         while(current<population_count){
         
             
         elite=select();
         child1 = new String [elite[0].size()];
         child2 = new String [elite[0].size()];
         
        
         int End=R.nextInt(elite[0].size());
         if(End==0){End++;}
         int Start=R.nextInt(End);
        

       
         for(int i=Start;i<=End;i++){
             child1[i]=elite[0].get(i);
             child2[i]=elite[1].get(i);
                  }
            
         
        for(int x=Start;x<=End;x++){
            boolean Check1=false;
      
            
            for(int y=Start;y<=End;y++){
            if(elite[1].get(x).equals(child1[y])){Check1=true;} }
           
            
            if(Check1==false){
               int z=elite[1].indexOf(elite[0].get(x));

                                 
                        boolean n=true;
                        while(n){
                        if(child1[z]==null){
                        child1[z]=elite[1].get(x); n=false;}
                        else{z=elite[1].indexOf(elite[0].get(z));}
                                     }
            }
     }
               
        
            for(int x=Start;x<=End;x++){
            boolean Check1=false;
      
            for(int y=Start;y<=End;y++){
            if(elite[0].get(x).equals(child2[y])){Check1=true;} }
           
            
            if(Check1==false){
               int z=elite[0].indexOf(elite[1].get(x));

                                 
                        boolean n=true;
                        while(n){
                        if(child2[z]==null){
                        child2[z]=elite[0].get(x); n=false;}
                        else{z=elite[0].indexOf(elite[1].get(z));}
                                     }
            }
     }
      
             
             for(int i=0;i<elite[0].size();i++){
          if(child1[i]==null){child1[i]=elite[1].get(i);}
          if(child2[i]==null){child2[i]=elite[0].get(i);}}  
    
        

         
        for(int i=0;i<elite[0].size();i++){
             Child2.add(child2[i]);
             Child1.add(child1[i]);} 
      
            if (Math.random() < 0.05)
            mutate(Child1);
            
            if (Math.random() < 0.05)
            mutate(Child2);
      
        
        population2[current].addAll(Child1);
        current++;
        population2[current].addAll(Child2);
          current++;
     
        Child1.clear();
        Child2.clear();
          
         }
         
         
          for (int i = 0; i < population_count; i++) {
            population[i].clear();
            population[i].addAll(population2[i]);
        }}


    
    
    
    
   public void Combined_Mutation(ArrayList<String> child) {

        ArrayList<String> temp = new ArrayList<>();
        int max =eval(child);
        temp.addAll(child);
        

        for(int i=0;i<child.size()-1;i++){
            
        for(int j=i+1;j<child.size();j++){

            
     String t=temp.remove(i);
     
     if(j+1==child.size()){temp.add(t);}else{temp.add(j+1, t);}
     
     int a=eval(temp);
     if(a>max){child.clear();child.addAll(temp);max=a;}else{temp.clear();temp.addAll(child);}
       

     int y=j;
     for(int x=i;x<=j;x++){temp.set(x, child.get(y));y--;}
     int b=eval(temp);
     if(b>max){child.clear();child.addAll(temp);max=b;}else{temp.clear();temp.addAll(child);}
        
        
         String t2=temp.get(j);
         temp.set(j, temp.get(i));
         temp.set(i, t2);
         int c=eval(temp);
         if(c>max){child.clear();child.addAll(temp);max=c;}else{temp.clear();temp.addAll(child);}
        
        }}
    }
   
   
   
   
   
 public void Displacement_mutation(ArrayList<String> Child) {
     
     
        ArrayList<String> temp1 = new ArrayList<>();
        ArrayList<String> temp2 = new ArrayList<>();
        Random random = new Random();
        int a= random.nextInt(Child.size());
        int b=random.nextInt(Child.size());
     
     
        while(a>=b)
        {
         a= random.nextInt(Child.size());
         b=random.nextInt(Child.size());}
            
        
        for(int i=a;i<=b;i++){
        temp2.add(Child.get(i));
        }
        
        
        for(int i=0;i<Child.size();i++){
        if(i<a||i>b){temp1.add(Child.get(i));}
        }
        
        
        if(temp1.size()==0){return;}
        int c= random.nextInt(temp1.size());
       
        
        for(int j=0;j<temp2.size();j++){temp1.add(c, temp2.get(j));c++;}
       Child.clear();
       Child.addAll(temp1);
       
        }
          
          
          
 
         
public void Inversion_Mutation(ArrayList<String> Child) {
      
    
      Random random = new Random();
      int a=random.nextInt(Child.size());
      int b=random.nextInt(Child.size());
      
      
      while(a>=b){
      a=random.nextInt(Child.size());
      b=random.nextInt(Child.size()); }
      
      ArrayList<String> temp1 = new ArrayList<>();
      
       for(int i=b;i>=a;i--){
       temp1.add(Child.get(i));}
       
       
       for(int i=a;i<=b;i++){
       Child.set(i,temp1.get(0));
       temp1.remove(0);}
       
  }
     
          

          
          
 public void Scramble_Mutation(ArrayList<String> Child) {
      
      Random random = new Random();
      int a=random.nextInt(Child.size());
      int b=random.nextInt(Child.size());
      
      
      while(a>=b){
      a=random.nextInt(Child.size());
      b=random.nextInt(Child.size()); }
      
      
      String temp[]=new String[(b-a)+1];
      
       for(int i=a;i<=b;i++){
           
           
         while(true){ 
             
             
       int r =random.nextInt(temp.length);
       if(temp[r]==null){
       temp[r]=Child.get(i);
       break;
       }
         }
       }
       
       int j=0;
       for(int i=a;i<=b;i++){
           
       Child.set(i,temp[j]);
       j++;}
       
  }
 
 
 
 
     
  public void PX(){
  
      
    int maximum = 0;
    ArrayList<String> temp = new ArrayList<>();
    for (int i = 0; i < population_count - 1; i++) {
    for (int j = i; j < population_count; j++) {
    if (eval(population[j]) > eval(population[maximum]))
     maximum = j;
        }
        temp.clear();
        temp.addAll(population[maximum]);
        population[maximum].clear();
        population[maximum].addAll(population[i]);
        population[i].clear();
        population[i].addAll(temp);
    }
  //sort
     
     ArrayList<String>[] elite;
 
     ArrayList <String> [] population2 = new ArrayList[population_count];
     for ( int i = 0 ; i < population2.length ; i++ ) {
     population2[i] = new ArrayList<>();
    }
     
     
     Random R = new Random();
     ArrayList <String> Child1 = new ArrayList <> ();
     ArrayList <String> Child2 = new ArrayList <> ();
     int current=0;
     while(current<population_count){
     
         
     elite=select();
        
     for(int i=0;i<elite[0].size();i++){
        Child1.add("");
        Child2.add("");

     }
        ////////child1

        int R1 = R.nextInt(elite[0].size());
        int y =0;

        while (y < R1){

            int b = R.nextInt(elite[0].size());

            if(!Child1.contains(elite[0].get(b))){

                Child1.set(b, elite[0].get(b));
            y++;
            }
            

        }

        for(int k = 0; k < elite[0].size();k++){

            if(!Child1.contains(elite[1].get(k))){
                Child1.set(Child1.indexOf(""), elite[1].get(k));
            }

        }

        ////////child2
        R1 = R.nextInt(elite[0].size());
        y =0;

        while (y < R1){

            int b = R.nextInt(elite[0].size());

            if(!Child2.contains(elite[1].get(b))){

                Child2.set(b, elite[1].get(b));
            y++;
            }
            

        }

        for(int k = 0; k < elite[0].size();k++){

            if(!Child2.contains(elite[0].get(k))){
                Child2.set(Child2.indexOf(""), elite[0].get(k));
            }

        }

     
  
        if (Math.random() < 0.05)
        mutate(Child1);
        
        if (Math.random() < 0.05)
        mutate(Child2);
  
    
    population2[current].addAll(Child1);
    current++;
    population2[current].addAll(Child2);
      current++;
 
    Child1.clear();
    Child2.clear();
      
     }
     
     
      for (int i = 0; i < population_count; i++) {
        population[i].clear();
        population[i].addAll(population2[i]);
    }

  }

  
  
 public void Crossover(){
 
 
    Random  r =new Random();
    int x;
    if(Crossover==1){x=r.nextInt(7-2+1)+2;}else{x=Crossover;}
    
    switch (x){
    case 2:
        scx();
        break;
    case 3:
        ox2();
        break;
    case 4:
        ER();
        break;
    case 5:
        PMX();
        break;
    case 6:
        CX();
        break;
    case 7:
        PX();
        break;
       
 }
 }}}