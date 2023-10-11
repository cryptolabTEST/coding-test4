import React from 'react';
import { Link } from 'react-router-dom';
import { styled } from 'styled-components';

function Home() {
  return (
    <Main>
      <div>
        <Paragraph>Hello, World!</Paragraph>
      </div>
      <Button>
        <Link to="/space">To Space</Link>
      </Button>
    </Main>
  );
}

const Main = styled.main`
  width: 100vw;
  height: 100vh;
`;

const Paragraph = styled.p`
  text-align: center;
`;

const Button = styled.button`
  position: absolute;
  bottom: 5vh;
  left: 45vw;
`;

export default Home;
