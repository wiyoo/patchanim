/*
 * patchanim - A bezier surface patch color blend gif builder
 * Copyright (C) 2008 Dave Brosius
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package com.mebigfatguy.patchanim.gui.events;

import java.util.EventObject;

import com.mebigfatguy.patchanim.PatchAnimDocument;

public class SettingsChangedEvent extends EventObject {
	private static final long serialVersionUID = 2005167344637800832L;

	private PatchAnimDocument doc;
	
	public SettingsChangedEvent(Object src, PatchAnimDocument document) {
		super(src);
		doc = document;
	}
	
	public PatchAnimDocument getDocument() {
		return doc;
	}
}
