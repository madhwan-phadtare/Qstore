const product = {
    sellerId: "seller_1",
    productName: "iphone",
    description: "good iphone 11",
    category: "Mobile Phone",
    price: "50,000",
    imageUrl: ["hello", "byy"]
  };
  
  fetch('http://localhost:8081/seller/add-product', {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json'
    },
    body: JSON.stringify(product)
  })
    .then(response => response.json())
    .then(data => console.log(data))
    .catch(error => console.error(error));
  