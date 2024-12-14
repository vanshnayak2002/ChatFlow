import React from 'react'
import { Routes,Route } from 'react-router'
import App from '../App'
import JoinCreateChat from '../component/JoinCreateChat'
import ChatPage from '../component/ChatPage'
const AppRoutes = () => {
  return (
  
    <Routes>
    <Route path="/" element={<JoinCreateChat/>}></Route>
    <Route path="/chat" element={<ChatPage></ChatPage>}/>
    <Route path="/about" element={<h1>This is a about Page</h1>}/>
    <Route path="/*" element={<h1>404 Page not Found</h1>}/>  
  
  </Routes>

)
}

export default AppRoutes
