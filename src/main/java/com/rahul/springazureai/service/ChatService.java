package com.rahul.springazureai.service;

import org.springframework.ai.azure.openai.AzureOpenAiChatModel;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

    private final AzureOpenAiChatModel azureOpenAiChatModel;

    public ChatService(AzureOpenAiChatModel azureOpenAiChatModel) {
        this.azureOpenAiChatModel = azureOpenAiChatModel;
    }

    public String getResponse(String prompt){

        return azureOpenAiChatModel.call(prompt);
    }

    public ChatResponse getResponseOptions(String prompt){
        return  azureOpenAiChatModel.call(new Prompt(prompt));
    }
}
