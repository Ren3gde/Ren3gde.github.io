[Home](README.md) | [Software Design](Software Design and Engineering.md) | [Algorithms](Algorithms and Data Structure.md) | [Databases](Databases.md)

# Software Design & Engineering

### Code Review: Pet.java Walkthrough
<video width="100%" controls style="max-width: 800px; margin-bottom: 25px;">
  <source src="Pet.java_CodeReview.mp4" type="video/mp4">
  Your browser does not support the video tag.
</video>
* **Overview:** This portfolio is a terminal-based Pet Boarding Management Application that tracks pet registration data, allocates physical kennel resources, and manages administrative checkouts.
* **Key Enhancements:** Inheritance Refactoring: The subclass structure was redesigned to establish clean constructor delegation using super(). Financial Type Safety: By stripping away inaccurate primitive types, it directly neutralized the binary floating-point rounding bugs common in native Java math.
* **Design Patterns:** Implemented the Encapsulation pattern to safeguard data mutation and applied standard Java naming conventions to enhance maintainability.

### Finalized Enhancements

* **Narrative:** [Milestone Two Narrative Update](MilestoneTwo_NarrativeUpdate.html)
* **Java Code:** [Boarding Manager](BoardingManager.java)
* **Java Code:** [New Dog Class](NewDog.java)
* **Java Code:** [New Pet Class](NewPet.java)
