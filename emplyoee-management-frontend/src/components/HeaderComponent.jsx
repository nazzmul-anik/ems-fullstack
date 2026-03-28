import React from 'react'
import { useNavigate } from 'react-router-dom'

const HeaderComponent = () => {
    const navigator = useNavigate();
    const home=()=>{
        navigator('/');
    }
  return (
    <div>
        <header>
            <nav className='navbar navbar-dark bg-dark'>
                <a onClick={home} className='navbar-brand home'>Employee Management System</a>
            </nav>
        </header>
    </div>
  )
}

export default HeaderComponent