<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>user</title>
</head>
<body>
   <h1>User profile Page</h1>
  <table>
    <tr>
      <td>First Name</td>
      <td>${user.fstname}</td>
    </tr>
    <tr>
      <td>Middle Name</td>
      <td>${user.secname}</td>
    </tr>
    <tr>
      <td>Age</td>
      <td>${user.age}</td>
    </tr>
  </table>
</body>
</html>