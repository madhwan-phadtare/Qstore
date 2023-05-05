fetch('http://localhost:8081/user/helloUser')
  .then(response => response.text())
  .then(data => console.log(data))
  .catch(error => console.error(error));
