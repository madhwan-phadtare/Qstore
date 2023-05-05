const product = {
    productId: "1",
    sellerId: "seller_1",
    productName: "Samsung Galaxy S212432",
    description: "Brand new Samsung Galaxy S21 in Phantom Black",
    category: "Mobile Phone",
    price: "55,000",
    imageUrl: [
      "https://example.com/images/s21_front.jpg",
      "https://example.com/images/s21_back.jpg"
    ]
  };
  
  fetch('http://localhost:8081/seller/update-product', {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json'
    },
    body: JSON.stringify(product)
  })
    .then(response => response.json())
    .then(data => console.log(data))
    .catch(error => console.error(error));
  