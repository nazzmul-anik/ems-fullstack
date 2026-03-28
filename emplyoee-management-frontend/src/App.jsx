import { useState } from 'react'
import './App.css'
import HelloWorld from './HelloWorld'
import ListEmployeeComponents from './components/ListEmployeeComponents'
import HeaderComponent from './components/HeaderComponent'
import FooterComponent from './components/FooterComponent'
import { BrowserRouter, Route, Routes } from 'react-router-dom'
import EmployeeComponent from './components/EmployeeComponent'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
    <BrowserRouter>
      <HeaderComponent/>
      <Routes>
        <Route path='/' element={<ListEmployeeComponents/>}></Route>
        <Route path='/employees' element={<ListEmployeeComponents/>}></Route>
        <Route path='/add-employee' element={<EmployeeComponent/>}></Route>
      </Routes>
      <FooterComponent/>
    </BrowserRouter>
    </>
  )
}

export default App
