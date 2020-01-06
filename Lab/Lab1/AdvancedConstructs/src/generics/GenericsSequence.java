/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author xavier.barras
 */
/**
 *@param <T> 
 */

public class GenericsSequence<T extends Comparable<T>> {
    private final Object[] elements;
    private int size;
    
    public GenericsSequence(){
        this.size=0;
        this.elements = new Object[100];
    }
    
    public void add(T element){
        if(this.size>= this.elements.length){
            throw new IllegalStateException();
        }
        
        this.elements[size] = element;
        this.size +=1;
    }
    
    public boolean remove(T element){
        int i = 0;
        while(i < this.size && element.compareTo((T) this.elements[i])!=0){
            i +=1;
            System.out.println(i);
        }
        if(i>=size){
            return false;
        }
        
        this.size -= 1;
        
        while(i < this.size){
            this.elements[i] = this.elements[i + 1];
        }
        
        return true;
    }
    
    public T get(int index){
        if(index < 0 || index>=this.size){
            throw new IllegalArgumentException();
        }
        return (T)this.elements[index];
    }
    
    public T max(){
        int i = 0;
        T max = (T) this.elements[0];
        while(i < this.size){
            if(max.compareTo((T) this.elements[i])<0){
                max = (T) this.elements[i];
            }  
            i++;
        }
        return max;
    } 
    
    public boolean removeAll(T[] list){
        if(this.size>= this.elements.length){
            throw new IllegalStateException();
        }
        System.out.println(list.length);
        int y = 0;
        while(y < list.length){
            remove(list[y]);
            y++;
        }
        System.out.println("End");
        return true;
    }
    
    public void getAll(){
        if(this.size>= this.elements.length){
            throw new IllegalStateException();
        }
        int i = 0;
        while(i < this.size){
            System.out.println(this.elements[i]);
            i++;
        }
    }
    
}
