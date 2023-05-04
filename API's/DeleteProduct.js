const productId = "1"; // Replace with the ID of the product to be deleted

fetch(`http://localhost:8081/delete-product?productId=${productId}`, {
  method: 'GET'
})
  .then(response => response.json())
  .then(data => console.log(data))
  .catch(error => console.error(error));
