<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<?xml version='1.0' encoding='UTF-8' ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://xmlns.jcp.org/jsf/html">
    <head>
        <title>OLD AGE HOSPITAL</title>
    </head>
    <body>
        <body bgcolor="#00FFFF"> 
            <h1><Strong>WELCOME TO OLD AGE HOSPITAL</Strong></h1>
                      <Script Language="JavaScript">
                          funtion testResults(form){
                              var TestVar = form.inputbox.value;
                              alert(TestVar);
                          }
                     </Script>
        </body>
                      <form action="">    
                          <fieldset>
                              <p>
                                  <lable>Username</lable>
                                  <input type="text" name="nameentry" value=""/>
                                  <p>
                                      <lable>Password</lable>
                                      <input type="Password" name="namepassword" value=""/>
                                      <input type="submit" value="Submit" onclick="testResults(this.form)"/>
                                      </p>
                                  </p>
                                          </fieldset>
                          </form>
    </body>
</html>
