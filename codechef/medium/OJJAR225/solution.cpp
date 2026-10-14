  const [activeIndex, setActiveIndex] = useState(null);

    const handleItemClick = (index) => {
        // If the clicked item is already open, close it (set to null), otherwise open it
            setActiveIndex(activeIndex === index ? null : index);
              };

                return (
                    <div className="accordion">
                          {items.map((item, index) => (
                                  <AccordionItem
                                            key={index}
                                                      title={item.title}
                                                                content={item.content}
                                                                          isActive={activeIndex === index}
                                                                                    onClick={() => handleItemClick(index)}
                                                                                            />
                                                                                                  ))}
                                                                                                      </div>
                                                                                                        );
                                                                                                        };

                                                                                                        export default Accordion;