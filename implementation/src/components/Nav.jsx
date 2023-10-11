import React from 'react';
import { Link } from 'react-router-dom';

function Nav() {
  return (
    <nav>
      <Link to="/">HOME</Link>
      <Link to="/space">HOME</Link>
      <Link to="/space/iss">HOME</Link>
      <Link to="/space/people">HOME</Link>
    </nav>
  );
}

export default Nav;
