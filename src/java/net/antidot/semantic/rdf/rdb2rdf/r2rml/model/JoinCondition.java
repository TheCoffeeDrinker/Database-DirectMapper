/* 
 * Copyright 2011 Antidot opensource@antidot.net
 * https://github.com/antidot/db2triples
 * 
 * DB2Triples is free software; you can redistribute it and/or 
 * modify it under the terms of the GNU General Public License as 
 * published by the Free Software Foundation; either version 2 of 
 * the License, or (at your option) any later version.
 * 
 * DB2Triples is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
/***************************************************************************
 *
 * R2RML Model : Join Condition Interface
 *
 * A join condition is a resource that has 
 * exactly two properties: 
 * 	- rr:child, whose value is known as the
 * 	  join condition's child column
 * 	- rr:parent, whose value is known as the
 * 	  join condition's parent column 
 *
 ****************************************************************************/
package net.antidot.semantic.rdf.rdb2rdf.r2rml.model;

public interface JoinCondition {
	
	/**
	 * Child column name must be a column name that exists in the logical table
	 * of the triples map that contains the referencing object map
	 */
	public String getChild();
	
	/**
	 * Parent column name must be a column name that exists in the logical table of the
	 * referencing object map's parent triples map.
	 */
	public String getParent();

}
