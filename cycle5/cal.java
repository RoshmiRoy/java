 private void button1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        int a,b,c;
       a= Integer.parseInt(textField1.getText());
       b= Integer.parseInt(textField2.getText());
       c=a+b;
       textField3 .setText(" " + c);
    }                                       

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {                                        
       int a,b,c;
       a= Integer.parseInt(textField1.getText());
       b= Integer.parseInt(textField2.getText());
       c=a-b;
       textField3 .setText(" " + c);
    }                                       

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {                                        
       int a,b,c;
       a= Integer.parseInt(textField1.getText());
       b= Integer.parseInt(textField2.getText());
       c=a*b;
       textField3 .setText(" " + c);
    }                                       

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {                                        
     int a,b,c;
       a= Integer.parseInt(textField1.getText());
       b= Integer.parseInt(textField2.getText());
       c=a/b;
       textField3 .setText(" " + c);    
    }                                       
