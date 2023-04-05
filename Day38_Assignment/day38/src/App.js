import logo from './logo.svg';
import './App.css';
import Demo1 from './democomponent/Demo1';
import ArrayDemo from './democomponent/ArrayDemo';
import Userregister from './democomponent/Userregister';
import { Routes,Route,Link } from 'react-router-dom';
import Home from './pages/Home';
import Other from './pages/Other';


function App() {
  return (
    <div >
     {/* <Demo1/>
        <br/>
     <ArrayDemo/>  
     <Userregister/> 
      */}
     <Routes>
        <Route path="/home" element={<Home />}></Route>
        <Route path="/" element={<Other/>}></Route>
        <Route path="/demo" element={<Demo1 />}></Route>
        <Route path="/arrayDemo" element={<ArrayDemo />}></Route>
        <Route path="/userregister" element={<Userregister />}></Route>
      </Routes>
      <Link to="/">Mix Work</Link> &nbsp;&nbsp;
      <Link to="/home">Home</Link>&nbsp;&nbsp;
      <Link to="/demo">SimpleDemo</Link>&nbsp;&nbsp;
      <Link to="/arrayDemo">ArrayDemo</Link>&nbsp;&nbsp;
      <Link to="/userRegister">Userregister</Link>
    </div>
  );
}

export default App;
