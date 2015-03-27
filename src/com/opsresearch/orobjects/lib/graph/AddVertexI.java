/* ***** BEGIN LICENSE BLOCK *****
 * 
 * Copyright (C) 2012 OpsResearch LLC (a Delaware company)
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License, version 3,
 * as published by the Free Software Foundation.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * ***** END LICENSE BLOCK ***** */

package com.opsresearch.orobjects.lib.graph;

public interface AddVertexI extends GraphI {
	public void ensureVertexCapacity(int vertexCapacity);

	public VertexI addVertex(Object key) throws DuplicateVertexException;

	public VertexI addVertex(Object key, Object value) throws DuplicateVertexException;

	public VertexI addVertex(VertexI vertex) throws DuplicateVertexException;
};
