import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import App from './App.jsx'
import {BrowserRouter, Route, Routes} from "react-router";
import AppRoutes from './config/Routes.jsx';
import { Toaster } from 'react-hot-toast';
import { ChatProvider } from './context/ChatContext.jsx';
import { ErrorBoundary } from "react-error-boundary";



createRoot(document.getElementById('root')).render(
 
    <ErrorBoundary fallback={<p>Something went wrong</p>}>
    <BrowserRouter>  
    <Toaster position="top-center"/>
    <ChatProvider>  <AppRoutes/>
    </ChatProvider>
 
</BrowserRouter>
</ErrorBoundary>


  
)
