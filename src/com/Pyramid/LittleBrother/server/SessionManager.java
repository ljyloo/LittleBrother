package com.Pyramid.LittleBrother.server;

class SessionManager{
    private Server server;

	public SessionManager(Server server){
        this.server = server;
    }

    private synchronized Server getServer(){
        return this.server;
    }
}