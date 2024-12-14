import { httpClient } from "../config/AxioHelper";

export const createRoomApi=async(roomDetail)=>{
    const response=await httpClient.post(`/api/v1/rooms`,roomDetail,{
        headers:{
            "Content-Type":"text/plain",
        },
    });
    return response.data;
};

export const joinChatApi=async(roomId)=>{
   
   const response = await httpClient.get(`/api/v1/rooms/${roomId}`);
   return response.data; 
}

export const getMessagess=async(roomId,size=50,page=0)=>{
    const response=await httpClient.get(`/api/v1/rooms/${roomId}/messages?size=${size}&page=${page}`);
    return response.data;
};