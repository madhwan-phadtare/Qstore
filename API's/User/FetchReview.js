const url = "http://localhost:8081/user/review"; // API endpoint URL
const reviewId = "1"; // Sample review ID

// Construct the URL with the review ID
const fullUrl = `${url}?reviewId=${reviewId}`;

// Send a GET request to fetch the review
fetch(fullUrl)
  .then(function(response) {
    // Check if the response is successful
    if (response.ok) {
      // Convert response to JSON
      return response.json();
    } else {
      throw new Error("Network response was not ok.");
    }
  })
  .then(function(data) {
    // Log the review data
    console.log(data);
  })
  .catch(function(error) {
    // Log any errors
    console.error(error);
  });
