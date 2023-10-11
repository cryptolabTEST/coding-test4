import { BrowserRouter as Router, Switch, Route, Link } from 'react-router-dom';

import Home from './pages/Home';
import Iss from './pages/Iss';
import Space from './pages/Space';
import People from './pages/People';

function App() {
  return (
    <Router>
      <Switch>
        <Route path="/space/iss">
          <Iss />
        </Route>
        <Route path="/space/people">
          <People />
        </Route>
        <Route path="/space">
          <Space />
        </Route>
        <Route path="/">
          <Home />
        </Route>
      </Switch>
    </Router>
  );
}

export default App;
