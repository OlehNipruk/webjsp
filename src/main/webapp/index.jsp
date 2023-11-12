<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
  <title>Input Page</title>
</head>
<body>
<h1>Input Page</h1>

<form action="function" method="post">
  <label for="a">a:</label>
  <input type="text" id="a" name="a" required>
  <br>
  <label for="b">b:</label>
  <input type="text" id="b" name="b" required>
  <br>
  <label for="c">c:</label>
  <input type="text" id="c" name="c" required>
  <br>
  <label for="start">start:</label>
  <input type="text" id="start" name="start" required>
  <br>
  <label for="end">end:</label>
  <input type="text" id="end" name="end" required>
  <br>
  <label for="step">step:</label>
  <input type="text" id="step" name="step" required>
  <br>
  <button type="submit">Submit</button>
</form>
</body>
</html>
