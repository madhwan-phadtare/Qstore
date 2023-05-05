const cartId = 'madhwan-cart';
const productId = '12';

fetch(`http://localhost:8081/user/cart/remove?cartId=${cartId}&productId=${productId}`)
  .then(response => {
    if (!response.ok) {
      throw new Error('Failed to add product to cart');
    }
    return response.text();
  })
  .then(responseText => {
    console.log(responseText);
  })
  .catch(error => {
    console.error(error);
  });
