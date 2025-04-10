       BDconexion db = new BDconexion();  
       Connection cn = db.getConnection();
       
       try{
       PreparedStatement pst = cn.prepareStatement("insert into alumnos(codigo,seccion,materia,grado) values(?,?,?,?);");
       pst.setString(1,jTextField1.getText());
       pst.setString(2,jTextField1.getText());
       pst.setString(3,jTextField1.getText());
       pst.setString(4,jTextField1.getText());
       int a = pst.executeUpdate();
       if(a>0){
           JOptionPane.showMessageDialog(null, "Registro almacenado");
       }else{
           JOptionPane.showMessageDialog(null, "Registro no almacenado pendejo de mierda agarre seriedad");
       }
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null,"ERROR: "+e);
       }
