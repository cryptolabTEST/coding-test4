import React from 'react';
import { Link } from 'react-router-dom';

function Space() {
  return (
    <div>
      <button>
        <Link to="/space/iss">ISS</Link>
      </button>
      <button>
        <Link to="/space/people">People</Link>
      </button>
    </div>
  );
}

export default Space;
