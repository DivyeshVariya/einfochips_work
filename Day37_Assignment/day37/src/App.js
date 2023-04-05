import logo from './logo.svg';
import './App.css';
import Example, { Example1 } from './democomponent/Sample';
import Sample from './democomponent/Sample1';
import Sample3 from './democomponent/Sample3';

function App() {
  return (
    <div className="App">
      <h1>Welcome to react</h1>
      <Example name="Virat" className="m1"><p>in side Example Component</p> </Example>
      <Example name="Dhoni" className="m2"/>
      <Example1/>
      <Sample3/>
      <Sample/>
    </div>
  );
}

export default App;
