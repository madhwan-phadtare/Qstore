fetch('http://localhost:8081/seller/helloseller')
  .then(response => response.text())
  .then(data => console.log(data))
  .catch(error => console.error(error));
