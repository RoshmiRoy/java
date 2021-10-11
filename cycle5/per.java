int a,b,c,d,e;
       float p,r,k;
       a= Integer.parseInt(textField1.getText());
       b= Integer.parseInt(textField2.getText());
       c= Integer.parseInt(textField3.getText());
       d= Integer.parseInt(textField4.getText());
       e= Integer.parseInt(textField5.getText());
        p=a+b+c+d+e;
        r =(p/500);  
        k = r*100;
       label6.setText(" " + k);
ImageIcon image1;
if(k >50)
{
    image1=new ImageIcon("C:\\Users\\student.MCALAB\\Documents\\NetBeansProjects\\cycle5\\src\\happy.jpg");
}    
else
{
    image1=new ImageIcon("C:\\Users\\student.MCALAB\\Documents\\NetBeansProjects\\cycle5\\src\\sad.png");
}
smiley.setIcon(image1);
