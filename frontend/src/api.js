import axios from 'axios';

const API_BASE_URL = 'http://localhost:8080'; // Backend URL

export const getReviews = async () => {
  const response = await axios.get(`${API_BASE_URL}/reviews`);
  return response.data;
};

export const addReview = async (review) => {
  const response = await axios.post(`${API_BASE_URL}/reviews`, review);
  return response.data;
};
