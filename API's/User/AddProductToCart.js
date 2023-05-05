const cartId = 'harish-cart';
const productId = '15';

fetch(`http://localhost:8081/user/cart/add?cartId=${cartId}&productId=${productId}`)
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
