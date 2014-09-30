package com.cgowdy.framework.util;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.cgowdy.game.state.State;

public class InputHandler implements KeyListener, MouseListener {

	private State currentState;

	@Override
	public void mouseClicked(MouseEvent arg0) {
		currentState.onClick(arg0);

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		currentState.onKeyPress(arg0);

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		currentState.onKeyRelease(arg0);

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void setCurrentState(State newState) {
		this.currentState = newState;
	}

}
