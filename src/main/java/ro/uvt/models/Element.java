package ro.uvt.models;

import javax.persistence.Entity;

public interface Element {
    void print();
    void accept(Visitor visitor);
}
