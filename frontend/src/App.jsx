import { useEffect, useState } from 'react';
import { getReviews } from './api';

const App = () => {
  const [reviews, setReviews] = useState([]);

  useEffect(() => {
    const fetchReviews = async () => {
      try {
        const data = await getReviews();
        setReviews(data);
      } catch (error) {
        console.error('Error fetching reviews:', error);
      }
    };
    fetchReviews();
  }, []);

  return (
    <div>
      <h1>User Reviews</h1>
      <ul>
        {reviews.map((review) => (
          <li key={review.id}>
            <strong>{review.userId || 'Anonymous'}</strong>: {review.content} (Posted on {new Date(review.createdAt).toLocaleString()})
          </li>
        ))}
      </ul>
    </div>
  );
};

export default App;
