package com.cgowdy.game.state;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import com.cgowdy.game.main.Resources;

public class MenuState extends State {

	@Override
	public void init() {
		System.out.println("Entered menu state.");

	}

	@Override
	public void update(float delta) {
		// TODO Auto-generated method stub

	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Resources.welcome, 0, 0, null);

	}

	@Override
	public void onClick(MouseEvent e) {
		System.out.println("Clicked the menu with " + e.getButton());

	}

	@Override
	public void onKeyPress(KeyEvent e) {
		System.out.println("Pressed " + e.getKeyChar() + " on main menu");

	}

	@Override
	public void onKeyRelease(KeyEvent e) {
		System.out.println("Released " + e.getKeyChar() + " on main menu");

	}

}
