import Findbyusername from './api/Findbyusername';
import Form from './api/Form';
import Viewalluser from './api/Viewalluser';
import './App.css';
import { Routes, Route, Link } from 'react-router-dom';

function App() {
  return (
    <div className="App">
      {/* <Viewalluser></Viewalluser> */}
      <Findbyusername></Findbyusername>
      {/* <Form></Form> */}
      {/* <Hookform/> */} 
      
        {/* <Link to="/viewall">View All</Link> */}
        {/* <Link to="/viewbyusername">View By User Name</Link> */}

          {/* <Routes> */}
                {/* <Route path='/viewall' element={<Viewalluser />}></Route> */}
                {/* <Route path='/viewbyusername' element={<Form />}></Route> */}
          {/* </Routes> */}
    </div>
  );
}

export default App;
