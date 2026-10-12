import { useContext } from 'react';
import { UserContext } from '../context/UserContext';

function Modal() {
  const { user, isModalOpen, setIsModalOpen } = useContext(UserContext);

    if (!isModalOpen || !user) return null;

      return (
          <div className="modal-overlay">
                <div className="modal-content">
                        <h2>Hello, {user.name}! Welcome</h2>
                                <p>We are thrilled to have you here. Enjoy exploring your dashboard!</p>
                                        <button className="close-button" onClick={() => setIsModalOpen(false)}>
                                                  Close
                                                          </button>
                                                                </div>
                                                                    </div>
                                                                      );
                                                                      }

                                                                      export default Modal;