import org.junit.jupiter.api.Test;
import org.sp.Element;
import org.sp.Image;
import org.sp.Paragraph;
import org.sp.Section;

import static org.junit.jupiter.api.Assertions.*;

public class SectionTests {
/*
    @Test
    public void givenSection_whenChildHasNoParent_thenAddChild(){
        Section section = new Section("test");
        Element child = new Image("");

        section.add(child);

        assertTrue(child == section.get(0));
    }

    @Test
    public void givenSection_whenChildHasParentAndSameSection_thenThrowExceptio(){
        Section section = new Section("test");
        Element child = new Image("");

        section.add(child);

        assertTrue(child == section.get(0));
        assertThrows(UnsupportedOperationException.class, () -> section.add(child));
    }

    @Test
    public void givenSection_whenChildHasParentAndDifferentSection_thenThrowException(){
        Section section = new Section("test");
        Element child = new Image("");

        section.add(child);

        Section section2 = new Section("");

        assertThrows(UnsupportedOperationException.class, () -> section2.add(child));
    }

    @Test
    public void givenSection_whenChildAndParentAreTheSame_thenThrowException(){
        Section section = new Section("test");

        assertThrows(UnsupportedOperationException.class, () -> section.add(section));
    }

    @Test
    public void givenLeaf_whenCallAggregateMethod_thenThrowException(){
        Element e = new Image("test");

        assertThrows(UnsupportedOperationException.class, () -> e.add(new Paragraph("")));
        assertThrows(UnsupportedOperationException.class, () -> e.remove(new Paragraph("")));
        assertThrows(UnsupportedOperationException.class, () -> e.get(0));
    }

    @Test
    public void givenParagraph_whenCallAggregateMethod_thenThrowException(){
        Element e = new Paragraph("test");

        assertThrows(UnsupportedOperationException.class, () -> e.add(new Paragraph("")));
        assertThrows(UnsupportedOperationException.class, () -> e.remove(new Paragraph("")));
        assertThrows(UnsupportedOperationException.class, () -> e.get(0));
    }*/
}
