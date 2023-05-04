fetch('http://localhost:8081/products?sellerId=seller_1')
  .then(response => response.json())
  .then(data => {
    console.log(data); // do something with the data
  })
  .catch(error => {
    console.error(error);
  });
