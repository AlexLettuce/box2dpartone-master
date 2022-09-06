package com.mygdx.game;

import com.badlogic.gdx.math.Vector2;

public class Maath {
        public static Vector2 normalize(Vector2 vector, float mul) {
            float x = vector.x;
            float y = vector.y;
            float sum = Math.abs(x)+Math.abs(y);
            x = (x/sum);
            y = (y/sum);
            x*=mul;
            y*=mul;
            return (new Vector2(x,y));
        }

        public static Vector2 mag(Vector2 vector){
            float x = vector.x;
            float y = vector.y;
            double magnitude = Math.sqrt(x*x+y*y);
            return new Vector2(x,y);
        }
}
