const url = "http://localhost:8081/user/review"; // API endpoint URL

// Sample review data
const review = {
  UserId: "user123",
  productId: "21",
  reviewMessage: "This is a sample review message.",
};

// Send a POST request to add the review
fetch(url, {
  method: "POST",
  headers: {
    "Content-Type": "application/json",
  },
  body: JSON.stringify(review),
})
  .then(response => response.text()) // Convert response to text
  .then(data => console.log(data)) // Log the response string
  .catch(error => console.error(error)); // Log any errors
