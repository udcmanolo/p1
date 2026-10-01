package e3;

public record Triangle() {
    /**
     * Constructs a Triangle object given its three internal angles
     * It is the canonical constructor .
     * @param angle0 Angle 0
     * @param angle1 Angle 1
     * @param angle2 Angle 2
     * @throws IllegalArgumentException if the angles do not sum 180 degrees
     */
    public Triangle { /* ... */ }


    /**
     * Copy constructor . Constructs a Triangle using another Triangle .
     * @param t The Triangle object to copy .
     */
    public Triangle ( Triangle t ) { /* ... */ }


    /**
     * Tests if a triangle is right .
     * A right triangle has one of its angles measuring 90 degrees .
     * @return True if it is right , false otherwise
     */
    public boolean isRight () { /* ... */ }


    /**
     * Tests if a triangle is acute .
     * A triangle is acute if all angles measure less than 90 degrees .
     * @return True if it is acute , false otherwise
     */
    public boolean isAcute () { /* ... */}


    /**
     * Tests if a triangle is obtuse .
     * A triangle is obtuse if it has one angle measuring more than 90 degrees .
     * @return True if it is obtuse , false otherwise
     */
    public boolean isObtuse () { /* ... */ }


    /**
     * Tests if a triangle is equilateral .
     * A triangle is equilateral if all the angles are the same .
     * @return True if it is equilateral , false otherwise
     */
    public boolean isEquilateral () { /* ... */ }


    /**
     * Tests if a triangle is isosceles .
     * A triangle is isosceles if it has two angles of the same measure .
     * @return True if it is isosceles , false otherwise
     */
    public boolean isIsosceles () { /* ... */ }


    /**
     * Tests if a triangle is scalene .
     * A triangle is scalene if it has all angles of different measure .
     * @return True if it is scalene , false otherwise
     */
    public boolean isScalene () { /* ... */ }


    /**
     * Tests if two triangles are equal .
     * Two triangles are equal if their angles are the same ,
     * regardless of the order .
     * @param o The reference object with which to compare .
     * @return True if they are equal , false otherwise .
     */
    @Override
    public boolean equals ( Object o ) { /* ... */ }



    /**
     * Hashcode function whose functioning is consistent with equals .
     * Two triangles have the same hashcode if their angles are the same ,
     * regardless of the order .
     * @return A value that represents the hashcode of the triangle .
     */
    @Override
    public int hashCode () { /* ... */ }
}
