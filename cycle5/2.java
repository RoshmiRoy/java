                                       
private void button1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
     int a,b,c,result;
     a=Integer.parseInt(textField1.getText());
     b=Integer.parseInt(textField2.getText());
     c=Integer.parseInt(textField3.getText());
     if (a>b) {
                  if (a>c)
                      result=a;
                  else
                      result=c;
                }
            else{
                  if (b>c) 
                      result=b;
                  else
                      result=c;
    }                                       
    label4.setText(" " +result);
    }



