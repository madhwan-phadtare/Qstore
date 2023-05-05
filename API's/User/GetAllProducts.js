fetch('http://localhost:8081/user/products?category=')
  .then(response => response.json())
  .then(data => {
    console.log(data); // do something with the data
  })
  .catch(error => {
    console.error(error);
  });
