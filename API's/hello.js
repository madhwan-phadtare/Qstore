fetch('http://localhost:8081/helloseller')
  .then(response => response.text())
  .then(data => console.log(data))
  .catch(error => console.error(error));
