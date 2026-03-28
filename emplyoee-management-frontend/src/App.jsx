import { useState } from 'react'
import './App.css'
import HelloWorld from './HelloWorld'
import ListEmployeeComponents from './components/ListEmployeeComponents'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <ListEmployeeComponents/>
    </>
  )
}

export default App
